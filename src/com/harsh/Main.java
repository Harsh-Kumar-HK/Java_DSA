package com.harsh;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(5);
        list.add(45);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);

        int i = 0;
//        System.out.print(list);
        list.removeLast();
        list.get(i); //thats how you extract and element
//        System.out.print(list);

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();

        for(i = 0; i<3 ; i++){
            list2.add(new ArrayList<>());
        }

        for(i = 0; i<3 ; i++){
            for(int j = 0; j<3 ; j++){
                list2.get(i).add(sc.nextInt());
            }
        }

        System.out.print(list2);




    }
}
