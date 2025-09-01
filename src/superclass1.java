public class superclass1 {

    superclass1(){
        this(6);
        System.out.println("5");

    }

    superclass1(int a){
        System.out.println("a = "+a);
    }
}

class superclass2 extends superclass1 {
    superclass2(){
        System.out.println("4");
    }

    superclass2(int b){
        this();
        System.out.println("b = "+b);
    }

    superclass2(int c , int d){
        this(3);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }

    public static void main(String[] args) {
        new superclass2(1 , 2);
    }



}

