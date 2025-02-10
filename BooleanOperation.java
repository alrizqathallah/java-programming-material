public class BooleanOperation {
  public static void main(String[] args) {
    
    // Boolean Operator atau Unary Operator
    /*
      && --> AND
      || --> OR
      ! --> NOT

      - Operator yang digunakan untuk mengoperasikan value boolean.

      Operator AND (&&):
      - true && true = true
      - true && false = false
      - false && true = false
      - fale && false = false
      Operator AND selalu mencari nilai yang salah (false).

      Operator OR (||):
      - true || true = true;
      - true || false = true;
      - false || true = true;
      - false || false = false;
      Operator OR selalu mencari nilai yang benar (true).

      Opertor NOT (!):
      - !true = false;
      - !false = true;
      Membalikan nilai.
     */

     var nilaiAbsen = 80;
     var nilaiUjian = 60;

     var lulusAbsen = nilaiAbsen >= 80;
     var lulusUjian = nilaiUjian >= 70;

     //var lulus = lulusAbsen && lulusUjian; // Jika nilai diperhitungkan secara keseluruhan.
     var lulus = lulusAbsen || lulusUjian; // Jika nilai diperhitungkan salah satu saja.

     System.out.println(lulus);
  }
}
