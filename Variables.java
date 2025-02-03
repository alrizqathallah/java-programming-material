/*
 * Java Variables
 * 
 * Variables adalah sebuah tempat (container) untuk menyimpan data (value).
 * 
 * Java memiliki beberapa jenis Tipe Data untuk Variable.
 */

public class Variables {
  public static void main(String[] args) {

    // Dalam pemrograman, penugasan variabel dapat dilakukan dengan "Variable Declaration"
    // ---> Memberikan nama untuk variabel
    // "Assignment Variabel", memberikan nilai (value) untuk variabel

    String name; // ---> Declaration variable
    name = "Benkz"; // ---> Assigment Variable

    int age = 26; // ---> Declaratino and Assignment Variable
    float gpa = 3.51f;
    char grade = 'A';
    boolean isStudent = true;

    System.out.println("the Name is: " + name); // ---> Print Varible
    System.out.println("the Age is: " + age);
    System.out.println("the GPA is: " + gpa);
    System.out.println("the Grade is: " + grade);
    System.out.println("the Student is: " + isStudent);
    
    // Operator + (plus) digunakan untuk melakukan operasi bersama dengan variabel yang dipanggil, untuk melakukan manipulasi output.
    
    // Print multiple variable
    System.out.println("Halo nama saya " + name + ", usia saya " + age + " tahun" + ", IPK saya adalah " + gpa);

    // One value to Multiple Variable

    int x, y, z;
    // Kita dapat mendeklarasikan variabel secara bersamaan, selagi variabel memiliki tipe data dan value yang sama.
    x = y = z = 50;

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    
    // Identifiers

    /*
     * Varible di Java harus di identifikasi penamaan dengan nama yang unik.
     * Penamaan dapat dilakuka secara deskriptif
     * Penamaan Variabel dapat mengandung huruf, bilangan, underscore dan tanda dollar.
     * Penamaan harus diawali dengan huruf, tidak bisa dengan angka!
     * Dapat diawali dengan huruf kecil (lowercase) atau huruf besar (uppercase)
     * Dapat diawali juga dengan _ (underscore) atau $ (dollar sign) untuk kasus tertentu
     * Penamaan variabel bersifat unik dan sensitif, satu makna berbeda bentuk bukan berarti sama!
     * Keyword yang telah ditetapka Java, TIDAK BISA digunakan sebagai nama variabel
     * Seperti keyword variabel, function dan statement lain.
     */

     int m = 60; // --> Tidak Deskriptif
     int minutePerHour = 60; // --> Deskriptif

     String myVar = "Variable";
     String MyVar = "Variable";

     // myVar dan MyVar secara total berbeda! meskipun semakna.
  }
}
