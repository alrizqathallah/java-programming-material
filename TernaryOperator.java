public class TernaryOperator {
  // Ternary Operator
  /*
    - Ternary operator adalah operator sederhana dari if statement
    - Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua yang diambil.
   */

   public static void main(String[] args) {
    var nilai = 70;
    String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

    // if (nilai >= 75) {
    //   ucapan = "Selamat Anda Lulus!";
    // } else {
    //   ucapan = "Silahkan Coba Lagi!";
    // }

    System.out.println(ucapan);
   }
}
