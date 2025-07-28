package com.example.jsf;

import java.sql.*;

public class GreetingDao {
    private static final String DB_URL = "jdbc:sqlite:greetings.db";

    public GreetingDao() {
        // Create table if it doesn't exist
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS greetings (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                         "name TEXT NOT NULL)";
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveGreeting(String name) {
        String sql = "INSERT INTO greetings(name) VALUES(?)";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getLastGreeting() {
        String sql = "SELECT name FROM greetings ORDER BY id DESC LIMIT 1";
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
} 