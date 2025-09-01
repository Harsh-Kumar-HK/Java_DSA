package collectionFramework;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("abhishek bhai");
        list1.add("Prashant bhai");
        list1.add("Ishita Chauhan");
        list1.add("Harsh Kumar");
        list1.add("Vasu bhai");
        list1.add("ayush maurya ");

        Iterator itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
