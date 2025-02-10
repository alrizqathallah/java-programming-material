public class TypeCasting {
  public static void main(String[] args) {
    // Type Casting
    /*
      Type Casting:
      - Widening Casting (Otomatis): Konversi dilakukan secara otomatis.
      - Narrowing Casting (Manual): Konversi dilakukan secara manual.

      Widening Casting: byte -> short -> int -> long -> float -> double
      - Setiap tipe data dapat mencukupi kebutuhan yang lebih kecil.

      Narrowing Casting: double -> float -> long -> int -> short -> byte
      - Setiap tipe data tidak dapat mencukupi kebutuhan yang lebih besar.
      - Jika dipaksa akan terjadi 'Number Overflow', karena kapasitas tidak mencukupi.
     */

     byte Byte = 100;
     short Short = Byte;
     int Int = Short;
     long Long = Int;
     float Float = Long;
     double Double = Float;

     float Float2 = (float) Double;
     long Long2 = (long) Float2;
     int Int2 = (int) Long2;
  }
}
