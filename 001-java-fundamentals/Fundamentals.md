# Fundamental Java

## Apa itu Java?

Java adalah bahasa pemrograman tingkat tinggi (*High Level Language*), dengan konsep *Object-Oriented Programming* (*OOP*) yang dikembangkan oleh *James Gosling* dan Tim di *Sun Microsystems* (sekarang dimiliki oleh *Oracle*) pada pertengahan 1990-an.

Dirancang dengan prinsip independensi platform, yang memungkinakn developer untuk menulis kode yang dapat berjalan disetiap platform apapun (seperti Windows, Linux, macOS, dll) tanpa kendala dan modifikasi.

Java merupakan bahasa yang *open source*, artinya kode sumber dapat diakses dan tersedia untuk umum, dan dikelola oleh *Java Community Process* (*JCP*).

### Karakteristik Java

1. **Pemrograman Berorientasi Objek** (*OOP*)

    - *Object*: suatu benda dalam programming yang memiliki *atribute* (*data* atau *properties*) dan perilaku (*methods* atau *functions*).

    - *Class*: *blueprint* atau cetakan untuk membuat objek.

    - *Encapsulation*: berarti membungkus sebuah data dan metode dalam satu unit (kelas), dan dibatasi atas akses kedalamnya.

    - *Inheritance*: memungkinkan sebuah kelas untuk mewariskan sifat atau perilaku dari kelas lain.

    - *Polymorphism*: memungkinkan satu fungsi memiliki banyak bentuk atau cara kerja yang berbeda.

    - *Abstraction*: menyembunyikan kerumitas teknis dan hanya menampilkan fungsionalitas kepada pengguna.

2. **Independen Platform**

    - Kode Java di kompilasi kedalam bentuk *bytecode* oleh Kompilator Java, bukan *machine code*.

    - Kode bytecode akan dijalankan di komputer (*machine*) yang memiliki *Java Virtual Machine* (*JVM*), membuat Java dapat ditulis sekali dan jalan dimanapun (*write once, run anywhere*).

    - JVM: mekanisme yang bertanggung jawab menjalankan kode java, dengan menginterpretasikan kode kedalam bentuk bytecode untuk platform yang spesifik.

3. **Simpel dan Mudah Dipelajari**

    - Java dirancang untuk menjadi lebih simpel ketimbang bahasa sebelumnya (*C++*) dengan meninggalkan kompleksitas.

    - tidak ada *Pointers* yang rentan kesalahan dan kebocora memori, manajemen memori otomatis dengan *garbage collection* dan *type checking* yang lebih mempermudah implementasi bahasa.

4. **Kokoh**

    - Java merupakan bahasa yang kokoh (*Robust*) dengan berbagai fitur modern seperti *exception handling*, *garbage collection* dan lainnya, membuat kode minim eror.

    - Dukungan fitur *type safety*, membuat variabel konsisten dengan tipe data yang ditentukan, dan *exception handling* mengatur penanganan eror.

5. **Keamanan**

    - Java menawarkan keamanan seperti *security manager* untuk menentukan akses kepada kelas, memastikan keamanan program terjaga.

    - bytecode Java akan diperiksa terlebih dahulu dari ancaman keamanan sebelum di eksekusi.

    - Model *Sandboxing* di Java memungkinkan untuk pemetaan kemananan lebih lanjut dari ancaman atau gangguan dalam sebuah *restricted environment*.

6. **Multithreading**

    - Java mendukung pemrograman *multithreading* yang dapat menjalankan beberapa program secara simultan.

    - *Thread Class* dan *Runnable Interface* memungkinkan untuk menjalankan program secara paralel.

    - Fitur yanga sangat berguna untuk meningkatkan kualitas program, terutama yang membutuhkan kinerja tinggi seperti *game*, *networking* dan *enterprise application*.

7. **Architecture Neutral**

    - Java bytecode dapat dijalankan hampir disemua platform, dengan syarat terinstal *JVM*.

    - JVM berperan seperti jembatan antara bytecode dan sistem operasi yang mendasarinya.

8. **Distributed Computing**

    - Java mulai menyederhanakan sistem terdistribusi (*distributed system*) dengan menyediakan alat seperti *RMI* (*Remotr Method Invocation*) dan *JNDI* (*Java Naming Directory Interface*).

9. **Performa Tinggi**

    - Meskipun Java bersifat *interpreted*, tetapi juga menawarkan opsi kompilasi biner dengan *JIT* (*Just in Time*) yang merubah bytecode kedalam binarycode.

    - Memungkinkan kinerja program jauh lebih tinggi dengan pemanfaatan *local environment*.

10. **Pustaka**

    - Java menjadi bahasa yang memiliki banyak sekali pustaka, untuk keperluan dasar, input/output, networking, GUI, game dan lainnya.

    - Beberapa pustaka terkemuka Java seperti *Java Collection Framework*, *JavaFX*, *Swing*, *Java Networking API*, dan *JDBC*.

