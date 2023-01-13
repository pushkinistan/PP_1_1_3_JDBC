package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД


    public static Connection getConnection() {

        Connection connection = null;

        try {
             connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/firstdb", "postgres", "root");

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return connection;

        }

}
