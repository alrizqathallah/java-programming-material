public class MathOperators {
  
  public static void main(String[] args) {
    // Math Operator:
    /*
      + -> Penjumlahan
      - -> Pengurangan
      * -> Perkalian
      / -> Pembagian
      % -> Sisa Bagi atau Modulus
     */

     // Simple Operations
     int x = 100;
     int y = 10;

     System.out.println(x + y);
     System.out.println(x - y);
     System.out.println(x * y);
     System.out.println(x / y);
     System.out.println(x % y);

     // Augmented Assignments
     /*
      - Penyederhanaan Operasi:
      a = a + 10 --> a += 10
      a = a - 10 --> a -= 10
      a = a * 10 --> a *= 10
      a = a / 10 --> a /= 10
      a = a % 10 --> a %= 10
      */

      int c = 100;

      c += 10;
      System.out.println(c);
      c -= 10;
      System.out.println(c);
      c *= 10;
      System.out.println(c);

      // Operator Unary
      /*
        Penyerdehanaan Operasi, jika pertambahan nilai atau pengurangan nilai hanya berlaku satu angka.

        ++ --> var = var + 1;
        -- --> var = var - 1;
        - --> Negatif
        + --> Positif
        ! --> Not (boolean Value).
       */

       int num = 100;

       num = num + 1;

       num++;

       System.out.println(num); // 101 / 102

       boolean yes = true;

       yes = !yes; // NOT

       System.out.println(yes); // False
  }
}
