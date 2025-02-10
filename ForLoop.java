public class ForLoop {
  public static void main(String[] args) {
    // For Loop
    /*
      - For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan.
      - Blok kode yang terdapat didalam for akan selalu diulangi selam kondisi for terpenuhi.

      Sintak Perulangan For

      for (init statement; Kondisi; post statement) {
          // Blok Perulangan
      }

      - init statement akan dieksekusi hanya sekali diawal sebelum perulangan
      - Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan diberhentikan.
      - Post Statement akan dieksekusi setiap kali diakhiri perulangan.
      - Init Statement, kondisi dan post statement tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi selalu bernilai true.
     */

     for (var counter = 1; counter <= 10;counter++) {
      System.out.println("Perulangan " + counter);
     }
  }
}
