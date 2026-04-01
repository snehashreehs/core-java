class Pintrest {

    String userName;
    String email;
    int pinsCount;
    long phoneNumber;
    boolean businessAccount;

    public Pintrest(String a, String b, int c, long d, boolean e) {
        userName = a;
        email = b;
        pinsCount = c;
        phoneNumber = d;
        businessAccount = e;
    }

    public void displayPins() {
        System.out.println(userName);
        System.out.println(email);
        System.out.println(pinsCount);
        System.out.println(phoneNumber);
        System.out.println(businessAccount);
        System.out.println("-----------");
    }
}