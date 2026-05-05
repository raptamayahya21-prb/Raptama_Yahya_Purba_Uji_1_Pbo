// Abstract class tidak bisa dibuat jadi objek langsung
abstract class Vehicle {
    protected String brand; // Access modifier protected agar bisa diakses subclass

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method: Tidak punya isi, wajib diisi oleh subclass nanti
    abstract void startEngine();
}