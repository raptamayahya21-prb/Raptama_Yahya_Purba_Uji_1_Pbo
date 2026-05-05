class Asr extends Prayer implements AudioReminder {
    public Asr(String time) { super("Ashar", time); }

    @Override
    void remind() {
        System.out.println("Pengingat: Waktu Ashar telah masuk, segerakan ibadah.");
    }

    @Override
    public void playAdhan() {
        System.out.println("Adzan Ashar: 'Allahu Akbar, Allahu Akbar...'");
    }
}