class TelegramRunner {

    public static void main(String[] args) {

        Telegram t1 = new Telegram("raj_tele", "raj@tg.com", 15, 9011111111L, true);
        t1.printData();

        Telegram t2 = new Telegram("anu_tele", "anu@tg.com", 9, 9022222222L, false);
        t2.printData();

        Telegram t3 = new Telegram("kiran_tele", "kiran@tg.com", 22, 9033333333L, true);
        t3.printData();

        Telegram t4 = new Telegram("meena_tele", "meena@tg.com", 5, 9044444444L, false);
        t4.printData();

        Telegram t5 = new Telegram("vijay_tele", "vijay@tg.com", 30, 9055555555L, true);
        t5.printData();

        Telegram t6 = new Telegram("ravi_tele", "ravi@tg.com", 11, 9066666666L, false);
        t6.printData();

        Telegram t7 = new Telegram("deepa_tele", "deepa@tg.com", 18, 9077777777L, true);
        t7.printData();
    }
}