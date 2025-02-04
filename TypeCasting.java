public class TypeCasting {
  public static void main(String[] args) {
    
    // Type Casting
    /*
     * Ketika menugaskan sebuah value data primitif ke tipe data lainnya.
     * 
     * Widening Casting: byte -> short -> int -> long -> float -> double 
     * 
     * Narrowing Casting: double -> float -> long -> int -> short -> byte
     */

     //Widening Casting
     int myInt = 9;
     double myDouble = myInt; // Otomatis diubah menjadi double

     System.out.println(myInt);
     System.out.println(myDouble);

     //Narrowing Casting
     double MyDouble = 9.78d;
     int MyInt = (int) MyDouble; // Mengubah manual: menjadi int

     System.out.println(MyDouble);
     System.out.println(MyInt);

    //Rela Life Example
    int maxScore = 500;

    int userScore = 423;

    float precentage = (float) userScore / maxScore * 100.0f;

    System.out.println("User Precentage: " + precentage);
  }
}
