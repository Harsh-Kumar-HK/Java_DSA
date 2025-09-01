public class error {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 5;
        int x ;
        int y;

//        x = c/(a-2*b);
//        System.out.println(x);
//        System.out.println("this is next line");



        try{
            x = c/(a-2*b);
            System.out.println(x);
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("this is finaly block");
        }
    }
}
