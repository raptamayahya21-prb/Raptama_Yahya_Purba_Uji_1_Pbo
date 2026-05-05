// Car mewarisi Vehicle DAN mengimplementasikan interface Electric
class Car extends Vehicle implements Electric {
    
    public Car(String brand) {
        super(brand); // Memanggil constructor dari bapaknya (Vehicle)
    }

    @Override
    void startEngine() {
        System.out.println("Mobil " + brand + ": Menyalakan mesin dengan tombol Start/Stop. (Vroom!)");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Mobil " + brand + ": Sedang mengisi daya baterai di stasiun pengisian...");
    }
}
