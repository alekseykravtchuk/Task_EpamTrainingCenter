package by.krava.etc.learn_by.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;

public class BatchMain {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mysql:/localhost:3306/telephones";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "225535");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        prop.put("useSSl", "true");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, prop);
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.addBatch("INSERT INTO phonebook VALUES (15, 'Bagdanovich', 112211" );
            statement.addBatch("INSERT INTO location (201, 'Karaganda')");
            statement.addBatch("INSERT INTO location (202, 'Lvov')");
            int [] updateCounts = statement.executeBatch();
            connection.commit();
            System.out.println(Arrays.toString(updateCounts));
        } catch (SQLException e) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
