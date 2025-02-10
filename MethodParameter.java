public class MethodParameter {

  // Method Parameter
  /*
    - Kita bisa mengirim informasi ke method yang ingin kita panggil.
    - Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat.
    - Cara membuat parameter sama seperti cara membuat variabel.
    - Parameter ditempatkan di dalam kurung () di deklarasikan method.
    - Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma.

   */

   static void SayHello(String firstName, String lastName) {
    System.out.println("Hello " + firstName + " " + lastName); 
   }
  public static void main(String[] args) {
    SayHello("Alrizq", "Athallah");
  }
}
