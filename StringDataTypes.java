public class StringDataTypes {
  public static void main(String[] args) {
    // String Data Types
    /*
      - Tipe data string adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks.
      - Di Java, tipe data string direpresentasikan dengan kata kunci String.
      - Untuk membuat string di Java, kita menggunakan karakter " " (petik dua) sebelum dan sesudah teks-nya.
      - Default value untuk String adalah null.
     */

    String firstName = "Alrizq";
    String lastName = "Athallah";

    System.out.println(firstName);
    System.out.println(lastName);

    // String Concatenation
    // Use + operator, to operate string

    String fullName = firstName + " " + lastName;

    System.out.println(firstName + " " + lastName);
    System.out.println(fullName);
  }
}
