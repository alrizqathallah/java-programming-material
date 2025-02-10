public class BreakContinue {
  public static void main(String[] args) {
    // Break & Continue
    /*
      - Pada Switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch.
      - Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
      - Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya.
     */
    
     var counter = 1;

     while(true) {
      System.out.println("Perulangan ke- " + counter);
      counter++;
      
      if(counter >= 10) {
        break;
      }
     }

     System.out.println("Perulangan Berhenti!");

     for (int count = 1; count <= 100; count++) {
      if (count % 2 == 0) {
        continue;
      }
      System.out.println("Bilangan ganjil: " + count);
     }
  }
}
