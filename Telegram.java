class Telegram {

    String userName;
    String mail;
    int groupCount;
    long phoneNumber;
    boolean premiumUser;

    public Telegram(String x, String y, int z, long m, boolean n) {
        userName = x;
        mail = y;
        groupCount = z;
        phoneNumber = m;
        premiumUser = n;
    }

    public void printData() {
        System.out.println(userName);
        System.out.println(mail);
        System.out.println(groupCount);
        System.out.println(phoneNumber);
        System.out.println(premiumUser);
        System.out.println("***********");
    }
}