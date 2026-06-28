# Simulasi OOP Java: Sistem Kendaraan & Interface Electric

Repository ini berisi proyek sederhana pemrograman berorientasi objek (OOP) menggunakan bahasa Java. Proyek ini mendemonstrasikan implementasi pilar-pilar utama OOP melalui studi kasus hirarki kendaraan (`Vehicle`) beserta dokumentasi teori dalam bentuk esai kode.

---

## 📋 Deskripsi Proyek

Proyek ini terbagi menjadi dua bagian utama:
1. **Simulasi Kode Program (OOP Implementation):** Penerapan struktur kelas yang memodelkan kendaraan konvensional dan kendaraan listrik untuk menunjukkan bagaimana objek berinteraksi.
2. **Esai Teori (`Essay.java`):** Penjelasan mendalam mengenai konsep OOP, fitur-fitur baru di Java 21 (seperti *Record* dan *Pattern Matching*), serta perbedaan antara *Abstract Class*, *Interface*, dan *Sealed Class*.

---

## 🏛️ Pilar OOP yang Diimplementasikan

* **Abstraction:** Menggunakan `abstract class Vehicle` untuk mendefinisikan kontrak dasar kendaraan tanpa mengekspos detail cara kerja mesin.
* **Inheritance:** Kelas `Car` dan `Motorcycle` mewarisi properti serta perilaku dari kelas induk `Vehicle`.
* **Polymorphism:** Instansiasi objek anak menggunakan referensi kelas induk (`Vehicle mobilSaya = new Car("Tesla S")`), serta penggunaan operator `instanceof` untuk pengecekan tipe objek secara dinamis.
* **Interface:** Menggunakan `interface Electric` sebagai kontrak tambahan khusus untuk kendaraan yang memiliki fitur pengisian daya baterai (`chargeBattery()`).

---

## 📂 Struktur File

* `Vehicle.java` - *Abstract class* sebagai induk dari semua jenis kendaraan.
* `Car.java` - Subclass yang mewarisi `Vehicle` dan mengimplementasikan `Electric`.
* `Motorcycle.java` - Subclass konvensional yang hanya mewarisi `Vehicle`.
* `Electric.java` - *Interface* untuk mendefinisikan kemampuan pengisian daya listrik.
* `MainApp.java` - Kelas utama (*driver class*) untuk menjalankan simulasi runtime dan polimorfisme.
* `Essay.java` - Dokumen edukasi berisi catatan teori OOP dan fitur modern Java.

---

Created By **Raptama Yahya Purba**
