public class MethodOverloading {
  // Method Overloading
  /*
    - Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
    - Namun, ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, antar jumlah atau tipe data parameternya.
    - Jika ada yang sama, maka program java akan eror.

   */

   static void greet(String nickname) {
    System.out.println("Hello " +  nickname);
   }

   static void greet(String firstName, String lastName) {
    System.out.println("Hello " + firstName + " " + lastName);
   }

   static void greet(String firstName, String lastName, String nickname) {
    System.out.println("Hello " + firstName + " " + lastName + " " + nickname);
   }

   public static void main(String[] args) {
    greet("Benkz");
    greet("Alrizq", "Athallah");
    greet("Alrizq", "Athallah", "Benkz");
   }
}
