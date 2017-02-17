package com.learning.spring.database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DatabaseConnector {

    private static Connection connection;
    private static List<String> authorization;

    private DatabaseConnector() {
    }


    // TODO: dobry pomysł, zazwyczaj jeszcze URL się podaje w takim pliku, a w Springu często także sterownik do obsługi

    /*
            typwy schemat pliku properties
            url =
            driver =
            user =
            password =
     */

    public static Connection createConnection() {
        String url = "jdbc:mysql://localhost:3306/spring";
        readDatabaseAuthorization("C:\\spring\\Backend\\database.txt");

        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, authorization.get(0), authorization.get(1));
                System.out.println("Database connected!");
            } catch (Exception e) {
                throw new IllegalStateException("Cannot connect the database!", e);
            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
            connection = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readDatabaseAuthorization(String filename) {
        try (Stream<String> stream = Files.lines(Paths.get(filename))) {
            authorization = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
