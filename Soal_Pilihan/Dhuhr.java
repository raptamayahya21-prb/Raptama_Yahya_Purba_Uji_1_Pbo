class Dhuhr extends Prayer implements AudioReminder {
    public Dhuhr(String time) { super("Zuhur", time); }

    @Override
    void remind() {
        System.out.println("Pengingat: Waktu Zuhur telah tiba, saatnya rehat sejenak.");
    }

    @Override
    public void playAdhan() {
        System.out.println("Adzan Zuhur: 'Allahu Akbar, Allahu Akbar...'");
    }
}