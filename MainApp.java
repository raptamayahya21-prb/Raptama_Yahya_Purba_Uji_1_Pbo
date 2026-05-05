public class MainApp {
    public static void main(String[] args) {
        // Penerapan Polymorphism: Tipe referensi adalah Vehicle (Bapak)
        // tapi objek aslinya adalah Car dan Motorcycle (Anak)
        Vehicle mobilSaya = new Car("Tesla Model S");
        Vehicle motorSaya = new Motorcycle("Honda CB150R");

        System.out.println("=== Demonstrasi Polymorphism ===");
        
        // Memanggil method yang sama, tapi hasilnya berbeda (Polymorphism)
        mobilSaya.startEngine();
        motorSaya.startEngine();

        System.out.println("\n=== Demonstrasi Interface ===");
        
        // Karena mobilSaya dideklarasikan sebagai Vehicle, 
        // kita perlu cek apakah dia punya fitur Electric sebelum charge
        if (mobilSaya instanceof Electric) {
            ((Electric) mobilSaya).chargeBattery();
        }
    }
}
