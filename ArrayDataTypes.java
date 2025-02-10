public class ArrayDataTypes {
  public static void main(String[] args) {
    // Array Data Types
    /*
      - Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama.
      - Jumlah data Array tidak bisa berubah setelah pertama kali dibuat.

      Cara Kerja:
      - Array bekerja menggunaka index, setiap index menetapkan posisi dari Array.
      - Index dimulai dari bilangan 0 dan seterusnya.
      - Array pertama bukan berarti Array ke-1 tetapi Array ke-0, karena Array dimulai dari 0.

      - Menetapkan panjang Array, ketika mulai membuat Array. (Array Length).
      - Array menyesuaikan hanya terhadap tipe data yang disetujui, tidak bisa diluar penetapan jenis Array.
      - Array Number (integer) hanya bisa diisi oleh tipe data Number (integer).
     */

     String[] arrayString;

     arrayString = new String[3];
     arrayString[0] = "Alrizq";
     arrayString[1] = "Athallah";
     arrayString[2] = "Benkz";

     System.out.println(arrayString[0]);
     System.out.println(arrayString[1]);
     System.out.println(arrayString[2]);

     String[] names = new String[10];

     String[] cars = {
      "BMW",
      "Mercedez-Benz",
      "Audi",
      "Porsche",
      "Volkswagen"
     };

     cars[3] = null; // Mengosongkan Data Array

     System.out.println(cars[0]); // BMW
     System.out.println(cars.length); // BMW
     System.out.println(cars[3]); // BMW

     // Urutan Assigning value untuk Array menentukan tempat (lokasi) data pada indeks.

     // Operasi di Array
     /*
     array[index] -> Mengambil data di array
     array[index] = value -> Mengubah data di array
     array.length -> Mengambil jumlah (panjang) array
      */
      // Di Java tidak ada penghapusan data Array, tetapi memasukan data kosong atau mengosongkan data pada Array.
      // Karena panjang Array yang dibuat ketika deklarasi Array sudah tetap, tidak bisa diubah.

      // Array didalam Array (Array 2D)
      String[][] motoGP = {
      {
        "Yamaha",
        "Honda",
        "Ducati",
        "KTM",
        "Aprillia"
      },
      {
        "Suzuki",
        "Kawasaki",
        "Mio",
        "Beat",
        "Vesmet"
      }
      };

      System.out.println(motoGP[0][1]); // Honda
      System.out.println(motoGP[1][0]); // Suzuki
  }
}
