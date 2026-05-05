public class PrayerApp {
    public static void main(String[] args) {
        // Menggunakan Polimorfisme untuk menampung semua waktu sholat
        Prayer[] daftarSholat = {
            new Fajr("05:05 WIB"),
            new Dhuhr("12:20 WIB"),
            new Asr("15:40 WIB"),
            new Maghrib("18:25 WIB"),
            new Isha("19:35 WIB")
        };

        System.out.println("=== APLIKASI JADWAL SHOLAT ===");
        System.out.println("------------------------------");

        for (Prayer s : daftarSholat) {
            s.showInfo();
            s.remind();
            
            // Cek apakah objek tersebut mendukung AudioReminder (Adzan)
            if (s instanceof AudioReminder) {
                ((AudioReminder) s).playAdhan();
            }
            System.out.println("------------------------------");
        }
    }
}