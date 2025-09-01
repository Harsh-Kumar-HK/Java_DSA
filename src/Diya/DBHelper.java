package Diya;

import java.sql.*;

public class DBHelper {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pmams";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "password"; // Replace with your MySQL password

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    public static void initDB()
    {
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS users (username VARCHAR(50) PRIMARY KEY, password VARCHAR(50), role VARCHAR(20))");
            stmt.execute("CREATE TABLE IF NOT EXISTS audit_log (time DATETIME, user VARCHAR(50), action TEXT)");

            stmt.executeUpdate("INSERT IGNORE INTO users VALUES ('pm', 'pm123', 'manager')");
            stmt.executeUpdate("INSERT IGNORE INTO users VALUES ('dev', 'dev123', 'developer')");
            stmt.executeUpdate("INSERT IGNORE INTO users VALUES ('audit', 'audit123', 'auditor')");
            stmt.executeUpdate("INSERT IGNORE INTO users VALUES ('diya', 'diya123', 'SO')");
            stmt.executeUpdate("INSERT IGNORE INTO users VALUES ('isha', 'isha123', 'HOD')");
            stmt.executeUpdate("INSERT IGNORE INTO users VALUES ('sneha', 'sneha123', 'NOCHOD')");
            stmt.executeUpdate("INSERT IGNORE INTO users VALUES ('ram', 'ram123', 'ASCO')");
        } catch (SQLException e)
        {
            System.out.println("Database init failed: " + e.getMessage());
        }
    }

    public static String getRole(String username, String password) {
        try (Connection conn = connect(); 
             PreparedStatement stmt = conn.prepareStatement("SELECT role FROM users WHERE username=? AND password=?")) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) return rs.getString("role");
        } catch (SQLException e) {
            System.out.println("Error retrieving role: " + e.getMessage());
        }
        return null;
    }
}