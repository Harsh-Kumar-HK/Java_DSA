package calculator;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

// This class actually adds two numbers
public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

    protected CalculatorImpl() throws RemoteException {
        super();  // Prepares it for remote access
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;  // Does the actual math!
    }
}
