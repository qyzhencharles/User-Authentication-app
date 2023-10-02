package com.example.servlettest;
import com.example.servlettest.db.SQLScriptExecutor;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.IOException;
import java.sql.SQLException;

public class AppInitializer implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            SQLScriptExecutor.executeSQLFile("path/to/your_script.sql");
            System.out.println("SQL script executed successfully.");
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Cleanup code, if needed
    }
}
