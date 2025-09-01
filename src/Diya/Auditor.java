package Diya;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public  class Auditor extends LoginPage {
    public Auditor(String username) {
        this.username = username;
    }

    @Override
    public void showDashboard() {
        System.out.println("=== Auditor Dashboard ===");
        try {
            Files.lines(Paths.get("audit_log.txt")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error reading audit logs.");
        }
        AuditLogger.log(username, "Viewed audit log");
    }
}