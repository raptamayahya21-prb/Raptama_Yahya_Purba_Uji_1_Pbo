// Motorcycle hanya mewarisi Vehicle (tidak punya fitur listrik dalam kasus ini)
class Motorcycle extends Vehicle {
    
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println("Motor " + brand + ": Menyalakan mesin dengan kick starter. (Brum Brum!)");
    }
}
