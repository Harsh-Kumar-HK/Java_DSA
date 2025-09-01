package Diya;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== PM + Audit Monitoring System ===");
        System.out.print("Username: ");
        String user = scanner.nextLine();
        System.out.print("Password: ");
        String pass = scanner.nextLine();

        if (user.equals("pm") && pass.equals("pm123")) {
            AuditLogger.log(user, "Logged in");
            new ProjectManager(user).showDashboard();
        } else if (user.equals("dev") && pass.equals("dev123")) {
            AuditLogger.log(user, "Logged in");
            new Developer(user).showDashboard();
        }else if (user.equals("audit") && pass.equals("audit123"))
        {
            AuditLogger.log(user, "Logged in");
            new Auditor(user).showDashboard();

        } else if (user.equals("diya") && pass.equals("diya123"))
        {
            AuditLogger.log(user, "Logged in");
            new SO(user).showDashboard();

        }else if (user.equals("isha") && pass.equals("isha123"))
        {
            AuditLogger.log(user, "Logged in");
            new HOD(user).showDashboard();

        }else if (user.equals("sneha") && pass.equals("sneha123"))
        {
            AuditLogger.log(user, "Logged in");
            new NOCHOD(user).showDashboard();

        } else if (user.equals("ram") && pass.equals("ram123"))
    {
        AuditLogger.log(user, "Logged in");
        new ASCO(user).showDashboard();

    } else {
            System.out.println("Login failed!");
        }

        scanner.close();
    }
}