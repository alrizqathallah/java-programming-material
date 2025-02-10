public class MethodReturnValue {

  // Method Return Value
  /*
    - Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah method mengembalikan nilai.
    - Agar method bisa mengembalikan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan.
    - Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method.
    - Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu.

   */

    static int sum(int num1, int num2) {
      var total = num1 + num2;
      return total;
    }

    static String greet(String firstName, String lastName) {
      String greeting = "Hello, " + firstName + " " + lastName;
      return greeting;
    }

  public static void main(String[] args) {
    var x = 100;
    var y = 200;
    var z = sum(x, y);

    var firstName = "Alrizq";
    var lastName = "Athallah";

    System.out.println(z);
    System.out.println(greet(firstName, lastName));
  }
}
