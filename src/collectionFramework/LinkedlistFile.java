package collectionFramework;
import java.util.*;


public class LinkedlistFile {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String>();
        al.add("Harsh kumar");
        al.add("Abhishek bhai");
        al.add("Ishita Chauhan");
        al.add("aley aley babu");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}


