package Diya;

public class Developer extends LoginPage {

    public Developer(String username) {
        this.username = username;
    }

    @Override
    public void showDashboard() {
        System.out.println("=== Developer Dashboard ===");
        System.out.println("Feature not implemented yet.");
        AuditLogger.log(username, "Accessed Developer Dashboard");
    }
}