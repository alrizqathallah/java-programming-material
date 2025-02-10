public class RecursiveMethod {

  // Recursive Method
  /*
    - Recursive method adalah kemampuan method untuk memanggil method dirinya sendiri.
    - Kadang memang ada banyak problem, yang lebih mudah di selesaikan menggunakan recursive method, seperti contohnya kasus factorial.

   */

   // Problem dengan Recursive
   /*
    - walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati.
    - Jika rekursif terlalu dalam, maka akan memungkinkan terjadi eror StackOverflow, yaitu eror dimana stack method terlalu banyak di Java.
    - Kenapa problem ini bisa terjadi? karena ketika kita memanggil method, Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain, maka stack akan menumpuk terus menerus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan eror StackOverflow.
    
    */

   static int factorial(int value) {
      var result = 1;
      for (int i = 1; i <= value; i++) {
        result = result * i;
      }

      return result;
   }

   static int recursive(int value) {
    if (value == 1) {
      return 1;
    } else {
      return value * recursive(value - 1);
    }
   }

   public static void main(String[] args) {
    System.out.println(factorial(5));

    System.out.println(recursive(10));

    System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10);
   }
  
}
