class Fajr extends Prayer implements AudioReminder {
    public Fajr(String time) { super("Subuh", time); }

    @Override
    void remind() {
        System.out.println("Pengingat: Sholat Subuh lebih baik daripada tidur.");
    }

    @Override
    public void playAdhan() {
        System.out.println("Adzan Subuh: 'Ash-shalaatu khairum minan-nawm...'");
    }
}
