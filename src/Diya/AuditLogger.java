package Diya;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AuditLogger {
    public static void log(String user, String action) {
        try (FileWriter writer = new FileWriter("audit_log.txt", true)) {
            writer.write(LocalDateTime.now() + " - " + user + ": " + action + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to audit log.");
        }
    }
}