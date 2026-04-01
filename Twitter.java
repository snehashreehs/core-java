class Twitter {

    String userHandle;
    String emailAddress;
    int followers;
    long phone;
    boolean isVerified;

    public Twitter(String a, String b, int c, long d, boolean e) {
        userHandle = a;
        emailAddress = b;
        followers = c;
        phone = d;
        isVerified = e;
    }

    public void show() {
        System.out.println(userHandle);
        System.out.println(emailAddress);
        System.out.println(followers);
        System.out.println(phone);
        System.out.println(isVerified);
        System.out.println("-----------");
    }
}