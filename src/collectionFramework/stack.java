package collectionFramework;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("tanya");
        stack.push("Nishtha");
        stack.push("tanishka");
        stack.push("payal");
        stack.push("regal");
        stack.pop(); // throw out the last inserted element
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
