public class MethodVariableArgument {

  // Method Variable Argument
  /*
    - Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti.
    - Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut.
    - Namun di Java, kita bisa menggunakan variabel argument, untuk mengirim data yang berisi jumlah tat tentu, bisa nol atau lebih.
    - Parameter dengan tipe variabel argument, hanya bisa ditempatkan diposisi akhir parameter.

   */

   static void sayCongrats(String name, int[] values) {
      var total = 0;

      for(var value : values) {
        total += value;
      }

      var finalValue = total / values.length;

      if (finalValue >= 75) {
        System.out.println("Selamat " + name + ", anda Lulus!"); 
      } else {
        System.out.println("Maaf " + name + ", anda Belum Lulus!"); 

      }
   }

   static void congrats(String name, int... values) {
    int total = 0;
    for (var value : values) {
      total += value;
    }

    var endValue = total / values.length;

    if(endValue >= 75) {
      System.out.println("Selamat " + name + ", anda Lulus!");
    } else {
      System.out.println("Maaf " + name + ", anda Belum Lulus!");
    }
   }
  public static void main(String[] args) {
    
    int[] values = {80, 80, 80, 80, 80};

    sayCongrats("Benkz", values);

    congrats("Benkz", 70, 75, 73, 75, 70, 80);
  }
}
