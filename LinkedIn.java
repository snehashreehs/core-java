class LinkedIn {

    String profileName;
    String emailId;
    int connections;
    long phoneNumber;
    boolean premiumUser;

    public LinkedIn(String x, String y, int z, long m, boolean n) {
        profileName = x;
        emailId = y;
        connections = z;
        phoneNumber = m;
        premiumUser = n;
    }

    public void showProfile() {
        System.out.println(profileName);
        System.out.println(emailId);
        System.out.println(connections);
        System.out.println(phoneNumber);
        System.out.println(premiumUser);
        System.out.println("***********");
    }
}