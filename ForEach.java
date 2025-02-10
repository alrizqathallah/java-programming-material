public class ForEach {
  public static void main(String[] args) {
    // For Each
    /*
      - Kadang kita biasa mengakses data Array menggunakan perulangan
      - Mengakses data Array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses Array menggunakan counter yang kita buat.
      - Namun, untungnya di Java terdapat perulangan For Each, yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis.

     */

     String[] names = {
      "Alrizq",
      "Athallah",
      "Sulung",
      "Esa",
      "Abenk",
     };
     
     for(int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
     }

     // For Each
     for (var value : names) {
      System.out.println(value);
     }

     for (var index : names) {
      System.out.println(index);
     }
  }
}
