class Isha extends Prayer implements AudioReminder {
    public Isha(String time) { super("Isya", time); }

    @Override
    void remind() {
        System.out.println("Pengingat: Waktu Isya telah tiba, akhiri hari dengan doa.");
    }

    @Override
    public void playAdhan() {
        System.out.println("Adzan Isya: 'Allahu Akbar, Allahu Akbar...'");
    }
}