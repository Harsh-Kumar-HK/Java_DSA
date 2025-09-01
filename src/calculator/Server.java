package calculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Make the calculator object
            CalculatorImpl calc = new CalculatorImpl();

            // Start RMI service on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Register it with the name "CalculatorService"
            registry.rebind("CalculatorService", calc);

            System.out.println("Calculator server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}