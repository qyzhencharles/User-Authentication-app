package com.example.servlettest.db;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLScriptExecutor {
    public static void executeSQLFile(String filePath) throws SQLException, IOException {
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                // Execute each SQL statement in the file
                statement.addBatch(line);
            }

            // Execute all statements in a batch
            statement.executeBatch();
        }
    }
}
