package Diya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HOD extends  LoginPage{
    List<Project> projects = new ArrayList<>();
    Project P1= new Project();

    public Project getP1() {
        return P1;
    }

    public HOD (String username) {
        this.username = username;
    }

    @Override
    public void showDashboard() {
    Project project= new Project("user", "password");
        System.out.println("=== HOD Dashboard ===");
        System.out.println("Hod name :: Raj");
        System.out.println("project :: Decentralised Portfolio ");
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome, Project Manager: " + username);

        do {

            System.out.println("1. View All Project Details");
            System.out.println("2. Logout");
            System.out.println("3. View Project Status Only");
            System.out.println("4. View Start Dates Only");
            System.out.println("5. View Expiry Dates Only");
            System.out.print("Enter choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Enter a valid number: ");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    viewProjects();
                    break;
                case 2:
                    AuditLogger.log(username, "Logged out");
                    System.out.println("Logging out...");
                    break;
                case 3:
                    viewStatus();
                    break;
                case 4:
                    viewStartDates();
                    break;
                case 5:
                    viewExpiryDates();
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }

        } while (choice != 3);
    }



    private void viewProjects() {
        System.out.println("\n--- All Project Details ---");


                System.out.println("\nProject Spotify Clone");
                System.out.println("Title       : Music");
                System.out.println("Description : Players");
                System.out.println("Start Date  : 1/5/2025");
                System.out.println("Expiry Date : 8/5/2025");
                System.out.println("Status      : In progress");


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
        System.out.println("\nSpotify Clone");
        System.out.println("Start Date  : 1/5/2025");

    }

    private void viewExpiryDates() {
        System.out.println("\nSpotify Clone");
        System.out.println("Expiry Date  : 8/5/2025");



    }

    private void viewSSLStatus()
    {
        System.out.println("\nProject Spotify Clone");
        System.out.println("Status      : In progress");


    }


  }




