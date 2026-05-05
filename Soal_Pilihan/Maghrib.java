class Maghrib extends Prayer implements AudioReminder {
    public Maghrib(String time) { super("Maghrib", time); }

    @Override
    void remind() {
        System.out.println("Pengingat: Waktu Maghrib singkat, jangan ditunda.");
    }

    @Override
    public void playAdhan() {
        System.out.println("Adzan Maghrib: 'Allahu Akbar, Allahu Akbar...'");
    }
}