public class DataTypes {
  public static void main(String[] args) {
    
    //Primitive Data Types
    byte byt = 100; // byte: Store whole numbers from -127 to 128
    short shrt = 30_000; // short: Store whole numbers from -32.768 to 32.767
    int integer = 2_000_000_000; // int: Store whole numbers from -2,147,483,648 to 2,147,483,647
    long lng = 9_000_000_000_000_000_000L; // long: Store whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float flt = 3.1234567f; // float: Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double dbl = 3.1234567891234567d; // double: Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
    boolean yes = true; // booelan: Stores true or false values
    boolean no = false; 
    char chr = 72; // char: Stores a single character/letter or ASCII values
    char chr2 = 73; // char: Stores a single character/letter or ASCII values
    char chr3 = 33; // char: Stores a single character/letter or ASCII values

    System.out.println(byt);
    System.out.println(shrt);
    System.out.println(integer);
    System.out.println(lng);
    System.out.println(flt);
    System.out.println(dbl);
    System.out.println(yes + " or " + no);
    System.out.println(chr + chr2 + chr3);

    // Not primitif Data Types
    String str = "Hello World!"; // Teks

    // - Array
    // - Classes

    System.out.println(str);
  }
}
