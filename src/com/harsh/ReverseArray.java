package com.harsh;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the values");

        int input = 0;
        for(int i = 0 ; i<5 ; i++){
            list.add(sc.nextInt());

        }

        printArray(list);
    }

    public static void printArray(ArrayList<Integer>  list){
        System.out.print(list.toString());
    }
}
