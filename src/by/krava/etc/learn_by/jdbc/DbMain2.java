package by.krava.etc.learn_by.jdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DbMain2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/telephones?serverTimezone=UTC";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "225535");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        prop.put("useSSL", "true");

        try (
                Connection connection = DriverManager.getConnection(url, prop);
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)
        ) {
            String sql = "SELECT idphonebook, lastname, phone FROM phonebook";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Abonent> abonents = new ArrayList<>();

            //insert row
            resultSet.moveToInsertRow();
            resultSet.updateInt(1, 1);
            resultSet.updateString(2,"Lopatin");
            resultSet.updateInt(3,2255353);
            resultSet.insertRow();
            resultSet.moveToCurrentRow();

            while(resultSet.next()) {
                //update row
                int id = resultSet.getInt(1);
                if(id == 11) {
                    resultSet.updateInt("phone", 2525636);
                    resultSet.updateRow();
                }
                String name = resultSet.getString(2);
                int number = resultSet.getInt("phone");
                abonents.add(new Abonent(id, name, number));
            }
            System.out.println(abonents);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
