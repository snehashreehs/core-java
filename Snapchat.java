class Snapchat {

    String snapUser;
    String mailAddress;
    int streakCount;
    long mobileNumber;
    boolean premiumStatus;

    public Snapchat(String x, String y, int z, long m, boolean n) {
        snapUser = x;
        mailAddress = y;
        streakCount = z;
        mobileNumber = m;
        premiumStatus = n;
    }

    public void showData() {
        System.out.println(snapUser);
        System.out.println(mailAddress);
        System.out.println(streakCount);
        System.out.println(mobileNumber);
        System.out.println(premiumStatus);
        System.out.println("***********");
    }
}