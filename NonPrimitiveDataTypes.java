public class NonPrimitiveDataTypes {
  public static void main(String[] args) {
    // Non-Primitif Data Types
    /*
      - Tipe data primitif adalah tipe bawaan didalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi.
      - Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value.
      - Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null.
      - Tipe data bukan primitif bisa memiliki method/function.
      - Di Java, semua ipe data primitif memiliki representasi tipe data bukan primitifnya.
     */

     // Representasi Tipe Data Primitif  (1)
     /*
      - byte -> Byte
      - short -> Short
      - int -> Integer
      - long -> Long
      - float -> FLoat
      - double -> Double
      - char -> Character
      - boolean -> Boolean

      Jikak membuat variabel dengan tipe data dengan bentuk non-Primitif maka default value dari variabel adalah 'null'.

      Default minumum dan maksimum berlaku sama!
      */

      Byte thisByte; // null
      thisByte = 100;

      Integer thisInt = null;


      System.out.println(thisByte);
      System.out.println(thisInt);

      // Konversi dari primitif ke non-primitif
      int iniInt = 30_000;
      Integer iniInteger = iniInt;

      System.out.println(iniInteger);

      int usia = 27;

      Integer usiaObjek = usia;

      int usiaLagi = usiaObjek;

      short usiaShort = usiaObjek.shortValue();
      byte usiaByte = usiaObjek.byteValue();

      long usiaLong = usiaObjek.longValue();

      float usiaFloat = usiaObjek.floatValue();

      long amount = 1_000_000_000_000L;

      // Setiap data non-primitif memiliki method value untuk mengubah kembali dalam bentuk primitif.
  }
}
