package collectionFramework;
import java.util.*;

public class vector {
    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("harsh");
        v.add("ishita");
        v.add("abhishek bhai");
        v.add("tanya bansal");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
