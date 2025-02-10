public class ExpressionStatementsBlock {
  public static void main(String[] args) {
    // Expression
    /*
      - Expression adalah konstruksi variabel, operator dan pemanggilan method yang mengevaluasi menjadi.
      - Expression adalah core component dari statement.
     */

     int num; // Expression
     num = 10; // Expression

     System.out.println(num > 9); //Statement, num > 9 adalah expression

    // Statements
    /*
      - Statements bisa dibilang adalah kalimat lengkap dalam bahasa.
      - Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma.
      - Ada beberapa jenis statement:
        - Assignment Expression
        - Penggunaan ++ dan --
        - Method Invocation
        - Object Creation Expression
     */

     int number = 1_000; // Assigment Statement

     number++; // Incremental Statement

     System.out.println("Hello, World!"); // Method Invocation Statement

     // Block
     /*
      - Block adalah kumpulan statement yang terdiri dari nol atau lebih statement.
      - Block diawali dan diakhiri dengan kurung kurawal { }.
      */
  }
}
