package calculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Find the server on localhost, port 1099
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Ask for the CalculatorService
            Calculator calc = (Calculator) registry.lookup("CalculatorService");

            // Call the remote method!
            int result = calc.add(10, 20);

            System.out.println("10 + 20 = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}