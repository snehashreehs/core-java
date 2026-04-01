class YouTube {

    String channelName;
    String email;
    int subscribers;
    long contactNumber;
    boolean monetized;

    public YouTube(String a, String b, int c, long d, boolean e) {
        channelName = a;
        email = b;
        subscribers = c;
        contactNumber = d;
        monetized = e;
    }

    public void displayChannel() {
        System.out.println(channelName);
        System.out.println(email);
        System.out.println(subscribers);
        System.out.println(contactNumber);
        System.out.println(monetized);
        System.out.println("-----------");
    }
}