public class If {
  public static void main(String[] args) {
    // If Statement
    /*
      - Dalam Java, if adalah kata kunci yang digunakan untuk percabangan.
      - Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika sutatu kondisi terpernuhi.
      - Hampir di semua bahasa pemrograman mendukung if expression.
     */

    // Else Statment
    /*
      - Blok if akan dieksekusi ketika kondisi if bernilai true.
      - Kadang kita ingin melakukan eksekusi program tertentu jika kondisiif bernilai false.
      - Hal ini bisa dilakukan menggunakan else expression.
     */

    // Else IF Statement
    /*
      - Kadang dalam if, kita butuh membuat beberapa kondisi.
      - Kasus seperti in, di Java kita bisa menggunakan Else If expression.
      - Else If di Java bisa lebih dari satu.
     */

    var nilai = 80;

    int[] lulus = {
      100,
      90,
      80,
      70,
      60
    };

    if (nilai >= lulus[1]) {
      System.out.println("Nilai: A+");
    } else if (nilai >= lulus[2]) {
      System.out.println("Nilai: A");
    } else if (nilai >= lulus[3]) {
      System.out.println("Nilai: B");
    } else if (nilai >= lulus[4]) {
      System.out.println("Nilai: C");
    } else {
      System.out.println("Nilai: D");
    }
  }
}
