class Google {

    String accountName;
    String gmailId;
    int storageUsed;
    long recoveryNumber;
    boolean twoStepVerification;

    public Google(String x, String y, int z, long m, boolean n) {
        accountName = x;
        gmailId = y;
        storageUsed = z;
        recoveryNumber = m;
        twoStepVerification = n;
    }

    public void showAccount() {
        System.out.println(accountName);
        System.out.println(gmailId);
        System.out.println(storageUsed);
        System.out.println(recoveryNumber);
        System.out.println(twoStepVerification);
        System.out.println("***********");
    }
}