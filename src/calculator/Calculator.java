package calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

// This is like a menu saying: "I can add two numbers!"
public interface Calculator extends Remote {
    int add(int a, int b) throws RemoteException;
}
