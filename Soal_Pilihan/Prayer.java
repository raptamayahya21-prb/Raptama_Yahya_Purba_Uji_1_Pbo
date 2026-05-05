abstract class Prayer {
    protected String name;
    protected String time;

    public Prayer(String name, String time) {
        this.name = name;
        this.time = time;
    }

    // Method abstrak yang wajib diisi oleh setiap waktu sholat
    abstract void remind();

    void showInfo() {
        System.out.println("Waktu " + name + " - " + time);
    }
}