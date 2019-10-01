package by.krava.etc.learn_by.jdbc;

import java.sql.*;
import java.util.Properties;

public class CallableStatementMain {
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
                Connection connection = DriverManager.getConnection(url, prop))
        {
            final String SQL = "{call findlastname(?, ?)}";
            CallableStatement statement = connection.prepareCall(SQL);
            statement.setInt(1, 225353);
            statement.registerOutParameter(2, java.sql.Types.VARCHAR);
            statement.execute();
            String lastName = statement.getString(2);
            System.out.println(lastName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
