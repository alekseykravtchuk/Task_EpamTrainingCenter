package by.krava.etc.learn_by.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        try {
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?serverTimezone=UTC", "root", "225535");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("ok");
    }
}
