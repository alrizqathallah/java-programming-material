public class ComparasionOperators {
  public static void main(String[] args) {
    // Comparasion Operators
    /*
      - Operasi perbandingan adalah operasi untuk membandingkan dua buah data.
      - Operasi perbangingan adalah operasi yang menghasilkan nilai boolean (benar atau salah).
      - Jika hasil operasinya adalah benar, maka nilainya adalah true.
      - Jika hasilnya operasinya adalah salah, maka nilainya adalah false.

      > --> Lebih dari.
      < --> Kurang dari.
      >= --> Lebih dari sama dengan.
      <= --> Kurang dari sama dengan.
      == --> Sama dengan, se-nilai.
      != --. Tidak sama dengan.
     */

     int x = 10;
     int y = 100;

     System.out.println(x < y); // True
     System.out.println(x > y); // False
     System.out.println(x <= y); // True
     System.out.println(x >= y); // False
     System.out.println(x == y); // False
     System.out.println(x != y); // True

     int p = 99; //98
     int q = 99;

     System.out.println(p == q); // True

     System.out.println(p < q); // False
     // Apakah nilai p lebih kecil dari nilai q? TIDAK LEBIH KECIL

     System.out.println(p > q); // False
     // Apakah nilai p lebih besar dari nilai q? TIDAK LEBIH BESAR


     System.out.println(p <= q); // True
     // Apakah nilai p lebih kecil atau sama dengan nilai q? BENAR!!!

  }
}
