public class Variable {
  public static void main(String[] args) {
    // Variable
    /*
      - Variable adalah tempat untuk menyimpan data.
      - Java adalah bahasa statis, "Static Language" sehingga sebuah variabel hanya bisa digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah tipde data seperti bahasa pemrograman dinamis.
      - Untuk membuat variabel di Java, kita bisa menggunakan nama tipe data lalu diikuti dengan nama variabelnya.
      - Nama variabel tidak boleh mengandung whitespace "spasi", "enter" atau "tab", dan tidak boleh keseluruhan menggunakan bilangan, terutama diawal.

     */

     // Declaration Variable
     String name;

     // Assignment / Initialization Variable
     name = "Alrizq Athallah";

     // Declaration and Initialization Variable
     String fullName = "Alrizq Athallah";

     String Name; // Default null.
     int Age; // Default 0.

     // Program berjalan secara prosedural, kode dieksekusi dari atas kebawah.

     System.out.println(name);
     System.out.println(fullName);

     // Keyword "var".
     /*
      - Sejak versi Java 10, Java mendukung pembuatan variabel dengan kata kunci 'var', sehingga kita tidak perlu menyebutkan tipe datanya.
      - Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variabel, kita harus menginisialisasi value / nilai dari variabel tersebut secara langsung.
      */

      var Nama = "Benkz";
      var Usia = 26;

      System.out.println(Nama);
      System.out.println(Usia);

      // Keyword 'final'.
      /*
        - Secara default, variabel di Java bisa berubah-ubah nilainya.
        - Jika kita ingin membuat sebuah variabel yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci 'final'.
        - Istilah variabel seperti ini, banyak juga yang menyebutnya konstan.
       */

      final String namaDepan = "Alrizq";
      final String namaBelakang = "Athallah";

      System.out.println(namaDepan + " " + namaBelakang);
  }
}
