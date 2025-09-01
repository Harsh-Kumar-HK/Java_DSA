public class Main {

  static void javaSum(int ... numbers) {
      int value = 0;
      for(int i : numbers){
          value += i;
      }
      System.out.println(value);
  }


  static void NegativeVal(int []arr){
      for(int i: arr){
          if(i<0){
              System.out.println(i);
          }
      }
  }

    public static void ArrMax(int [] val) {
        int max = val[0];
        for(int i: val){
            if(i>max){
                max = i;
            }
        }
        }

    public static void ArrMin(int [] val) {
        int max = val[0];
        for(int i: val){
            if(i<max){
                max = i;
            }
        }
        System.out.println();
    }




  public static void main(String[] args) {
//      javaSum(2 , 3 , 4 , 5 );

      int []val  = {1, 2 , -3 , 6 , -8 ,-5 };
//      NegativeVal(val);


    }
}