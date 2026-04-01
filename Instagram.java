class Instagram {

    String username;
    String email;
    int followers;
    long phoneNumber;
    boolean verified;

    public Instagram(String p1, String p2, int p3, long p4, boolean p5) {
        username = p1;
        email = p2;
        followers = p3;
        phoneNumber = p4;
        verified = p5;
    }

    public void display() {
        System.out.println(username);
        System.out.println(email);
        System.out.println(followers);
        System.out.println(phoneNumber);
        System.out.println(verified);
        System.out.println("------------");
    }
}