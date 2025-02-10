public class Switch {
  public static void main(String[] args) {
    // Switch Statement
    /*
      - Kadang kita hanya butuh menggunakan kondisi sederhana di If Statement, seperti hanya menggunakan perbandinga ==.
      - Switch adalah statement percabangan yang sama dengan If, namun lebih sederhana cara pembuatannya.
      - Kondisi di switch statement hanya untuk perbandingan ==.
     */

     var nilai = "C";

    switch (nilai) {
      case "A":
          System.out.println("Nilai sangat Baik");
        break;
      case "B":
          System.out.println("Nilai Baik");
        break;
      case "C":
          System.out.println("Nilai Cukup Baik");
        break;
      case "D":
          System.out.println("Nilai Cukup");
        break;
      default:
          System.out.println("GOBLOK!");
        break;
    }

    // Switch Lambda (Java 14)
    /*
      - Di Java versi 14, diperkenalkan switch expression dengan lambda.
      - Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break;.
     */

     var value = "E";

     switch (value) {
      case "A" -> System.out.println("Nilai Sangat Baik");
      case "B", "C" -> System.out.println("Nilai Baik");
      case "D" -> System.out.println("Nilai Cukup!!!");
      default -> System.out.println("Goblok");
     }

     // Keyword 'yield'
     /*
     - Di Java 14, ada kata kunci baru yaitu 'yield', dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement
     - Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement.
      */

    String num = "A";

        String ucapan = switch (num) {
            case "A" -> {
                yield "Nilai A"; // Menggunakan yield dalam blok {}
            }
            case "B" -> {
                yield "Nilai B";
            }
            default -> {
                yield "Nilai C";
            }
        };

        System.out.println(ucapan);
        
  }
}
