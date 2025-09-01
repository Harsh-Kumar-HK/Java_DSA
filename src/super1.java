public class super1 {
    super1(){
        this(1);
        System.out.println("1");
    }

    super1(int a){
        System.out.println("a ="+ a);
    }
}

class super2 extends super1 {
    super2(){
        super(1);
        System.out.println("2");
    }

    super2(int b){
        this();
        System.out.println("b = " +b);
    }

    public static void main(String[] args){
        System.out.println("programme starts");
        new super2(3);
    }
}
