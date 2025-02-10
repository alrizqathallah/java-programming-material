public class NumberDataTypes {
  public static void main(String[] args) {
    // Numbe Data Types
    /*
      - Integer Number
      - Floating Point Number

      Integer Number:
      - byte: -128 to 127, 1 byte and default 0.
      - short: -32,768 to 32,767, 2 bytes and default 0.
      - int: -2,147,483,648 to 2,147,483,647, 4 bytes and default 0.
      - long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, 8 bytes and default 0.

      Perbedaan, terletak pada kapasitas number dan size memori.
      Sesuaikan kebutuhan data berdasarkan jenis data.
     */

     byte Byte = 100;
     short Short = 30_000;
     int Int = 2_000_000_000;
     long Long = 9_000_000_000_000_000_000L;

     // Underscrore, digunakan untuk mempermudah pembacaan kode, tidak akan mempengaruhi kompilasi program dan operasi.
     // Hanya digunakan oleh developer sebagai alat bantu, bersifat seperti komentar, yang akan diabaikan oleh compiler.

  /*
    Floating Point Number:
    - float: decimal point 6 to 7, 4 bytes and default 0.0
    - double: decimal point 15 to 16, 8 bytes and default 0.0 (more precision).
   */

   float Float = 3.1234567f;
   double Double = 3.123456781234567d;

   // Number Literals
   int HexInt = 0xa132b; // Hexadecimal
   int BinInt = 0b01010101; // Binary

   System.out.println(Byte);
   System.out.println(Short);
   System.out.println(Int);
   System.out.println(Long);
   System.out.println(Float);
   System.out.println(Double);
   System.out.println(HexInt);
   System.out.println(BinInt);
  }
}
