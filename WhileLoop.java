public class WhileLoop {
  public static void main(String[] args) {
    // While Loop
    /*
      - While Loop adalah versi perulangan yang lebih sederhana dibanding dengan for loop.
      - Di While Loop, hanya terdapat kondisi dan perulangan, tanpa ada init statement dan post statement.

     */

     var counter = 1;

     while (counter <= 10) {
      System.out.println("Perulangan: " + counter);
      counter++;
     }
  }
}
