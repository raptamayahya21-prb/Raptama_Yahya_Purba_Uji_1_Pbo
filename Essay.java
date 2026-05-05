public class Essay {
    public static void main(String[] args) {

        /*
        1. Encapsulation, Inheritance, Polymorphism, Abstraction

        Dalam OOP, empat konsep ini sebenarnya saling melengkapi.
        Abstraction biasanya dipakai di awal, untuk menyederhanakan
        sistem. Kita cuma fokus ke hal pentingnya saja. Contohnya
        kayak remote TV, kita tinggal tekan tombol tanpa tahu
        proses di dalamnya.

        Setelah itu ada encapsulation, yang tugasnya menjaga data
        supaya tidak diubah sembarangan. Misalnya seperti ATM,
        kita tidak bisa langsung ambil uang, harus lewat sistem.

        Inheritance membantu supaya kita tidak menulis kode yang
        sama berulang-ulang. Class bisa mewarisi dari class lain.
        Contohnya seperti anak yang mewarisi sifat orang tuanya.

        Polymorphism membuat satu method bisa punya banyak bentuk.
        Misalnya “jalan”, mobil jalan di darat, kapal di air.
        Sama-sama jalan, tapi cara kerjanya beda.

        Kalau digabung, keempatnya bikin sistem lebih rapi,
        mudah dikembangkan, dan tidak ribet kalau mau diperbaiki.
        */

        /*
        2. Kelebihan Java 21

        Java 21 punya beberapa fitur yang bikin coding lebih simpel.

        a. Record
        Kita bisa bikin class data tanpa nulis banyak kode.
        Biasanya kan harus bikin getter, setter, dll.
        Dengan record jadi lebih ringkas.

        Contoh:
        record Mahasiswa(String nama, int nim) {}

        b. Pattern Matching (switch)
        Lebih gampang buat ngecek tipe data tanpa casting manual.

        switch(obj) {
            case String s -> ...
            case Integer i -> ...
        }

        Jadi kodenya lebih bersih dan enak dibaca.
        */

        /*
        3. Perbedaan Class dan Object

        Class itu seperti cetakan, sedangkan object adalah hasilnya.

        Analogi:
        Class = blueprint rumah
        Object = rumah yang sudah jadi

        Contoh:
        class Mahasiswa {
            String nama;
            int nim;
        }

        Mahasiswa m1 = new Mahasiswa();

        Jadi class hanya rancangan, object yang dipakai di program.
        */

        /*
        4. Encapsulation pada BankAccount

        Supaya balance aman, kita buat dia private.
        Jadi tidak bisa diubah langsung dari luar.

        class BankAccount {
            private double balance;

            public void deposit(double amount) {
                if(amount > 0) balance += amount;
            }

            public double getBalance() {
                return balance;
            }
        }

        Kenapa penting?
        Supaya data tidak sembarangan diubah dan tetap aman.
        */

        /*
        5. Constructor Chaining

        Constructor chaining itu pemanggilan constructor parent
        dari subclass pakai super().

        class Karyawan {
            Karyawan(String nama) {}
        }

        class Manager extends Karyawan {
            Manager(String nama) {
                super(nama);
            }
        }

        Kalau tidak dipanggil, Java otomatis manggil super().
        Tapi kalau parent tidak punya constructor kosong,
        nanti error.
        */

        /*
        6. Polymorphism dengan Interface

        Interface bikin kode lebih fleksibel.

        interface Pembayaran {
            void bayar();
        }

        class EWallet implements Pembayaran {
            public void bayar() {
                System.out.println("E-Wallet");
            }
        }

        Jadi kita bisa pakai:
        Pembayaran p = new EWallet();

        Lebih mudah kalau mau nambah metode pembayaran baru.
        */

        /*
        7. Abstract Class vs Interface vs Sealed Class

        Abstract class:
        Bisa punya method biasa dan atribut.
        Cocok kalau ada hubungan kuat antar class.

        Interface:
        Lebih ke “kontrak”.
        Cocok untuk polymorphism.

        Sealed class:
        Membatasi class yang boleh turunan.
        Cocok untuk kontrol struktur.

        Jadi pemakaiannya tergantung kebutuhan.
        */

    }
}