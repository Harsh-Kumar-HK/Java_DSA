package Diya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectManager extends LoginPage {

    private List<Project> projects = new ArrayList<>();

    public ProjectManager(String username) {
        this.username = username;
    }

    @Override
    public void showDashboard() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome, Project Manager: " + username);

        do {
            System.out.println("\n--- Project Manager Dashboard ---");
            System.out.println("1. Create Project");
            System.out.println("2. View All Project Details");
            System.out.println("3. Logout");
            System.out.println("4. View Project Status Only");
            System.out.println("5. View Start Dates Only");
            System.out.println("6. View Expiry Dates Only");
            System.out.print("Enter choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Enter a valid number: ");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createProject(scanner);
                    break;
                case 2:
                    viewProjects();
                    break;
                case 3:
                    AuditLogger.log(username, "Logged out");
                    System.out.println("Logging out...");
                    break;
                case 4:
                    viewStatus();
                    break;
                case 5:
                    viewStartDates();
                    break;
                case 6:
                    viewExpiryDates();
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }

        } while (choice != 3);
    }

    private void createProject(Scanner scanner) {
        System.out.print("Enter project title: ");
        String title = scanner.nextLine();

        System.out.print("Enter description: ");
        String desc = scanner.nextLine();

        System.out.print("Enter start date (yyyy-mm-dd): ");
        String startDate = scanner.nextLine();

        System.out.print("Enter expiry date (yyyy-mm-dd): ");
        String expiryDate = scanner.nextLine();

        System.out.print("Enter project status (Live/Paused): ");
        String status = scanner.nextLine();

       // Project p = new Project(title, desc, startDate, expiryDate, status);
       // projects.add(p);

        AuditLogger.log(username, "Created project: " + title);
        System.out.println("✅ Project created successfully.");
    }

    private void viewProjects() {
        System.out.println("\n--- All Project Details ---");

        if (projects.isEmpty()) {
            System.out.println("No projects found.");
        } else {
            for (int i = 0; i < projects.size(); i++) {
                Project p = projects.get(i);
                System.out.println("\nProject " + (i + 1));
                System.out.println("Title       : " + p.getTitle());
                System.out.println("Description : " + p.getDescription());
                System.out.println("Start Date  : " + p.getStartDate());
                System.out.println("Expiry Date : " + p.getExpiryDate());
                System.out.println("Status      : " + p.getStatus());
            }
        }
    }

    private void viewStatus() {
        System.out.println("\n--- Project Status List ---");

        if (projects.isEmpty()) {
            System.out.println("No projects found.");
        } else {
            for (int i = 0; i < projects.size(); i++) {
                System.out.println("Project " + (i + 1) + " Status: " + projects.get(i).getStatus());
            }
        }
    }

    private void viewStartDates() {
        System.out.println("\n--- Project Start Dates ---");

        if (projects.isEmpty()) {
            System.out.println("No projects found.");
        } else {
            for (int i = 0; i < projects.size(); i++) {
                System.out.println("Project " + (i + 1) + " Start Date: " + projects.get(i).getStartDate());
            }
        }
    }

    private void viewExpiryDates() {
        System.out.println("\n--- Project Expiry Dates ---");

        if (projects.isEmpty()) {
            System.out.println("No projects found.");
        } else {
            for (int i = 0; i < projects.size(); i++) {
                System.out.println("Project " + (i + 1) + " Expiry Date: " + projects.get(i).getExpiryDate());
            }
        }
    }

    private void viewSSLStatus() {
        System.out.println("\n--- Project Start Dates ---");

        if (projects.isEmpty()) {
            System.out.println("No projects found.");
        } else {
            for (int i = 0; i < projects.size(); i++) {
                System.out.println("Project " + (i + 1) + " Start Date: " + projects.get(i).getStartDate());
            }
        }

    }
}
