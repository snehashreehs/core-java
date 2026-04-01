class GoogleRunner {

    public static void main(String[] args) {

        Google g1 = new Google("Tanvi_google", "Tanvi@gmail.com", 100, 7443444455L, true);
        g1.showAccount();

        Google g2 = new Google("sneha_google", "sneha@gmail.com", 400, 7897986875L, false);
        g2.showAccount();

        Google g3 = new Google("aryan_google", "aryan@gmail.com", 700, 1132334534L, true);
        g3.showAccount();

        Google g4 = new Google("rohan_google", "rohan@gmail.com", 500, 5678687982L, false);
        g4.showAccount();

        Google g5 = new Google("arjun_google", "arjun@gmail.com", 600, 9978764153L, true);
        g5.showAccount();

        Google g6 = new Google("saanvi_google", "saanvi@gmail.com", 900, 3232543657L, false);
        g6.showAccount();

        Google g7 = new Google("arav_google", "arav@gmail.com", 543, 8657777777L, true);
        g7.showAccount();
    }
}