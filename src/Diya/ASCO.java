package Diya;

public class ASCO  extends  LoginPage{
    public ASCO (String username) {
        this.username = username;
    }

    @Override
    public void showDashboard()
    {
        System.out.println("=== ASCO Dashboard ===");
    }
}
