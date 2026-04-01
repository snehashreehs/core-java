class WhatsApp {

    String contactName;
    String emailId;
    int chatCount;
    long phoneNumber;
    boolean onlineStatus;

    public WhatsApp(String a, String b, int c, long d, boolean e) {
        contactName = a;
        emailId = b;
        chatCount = c;
        phoneNumber = d;
        onlineStatus = e;
    }

    public void displayInfo() {
        System.out.println(contactName);
        System.out.println(emailId);
        System.out.println(chatCount);
        System.out.println(phoneNumber);
        System.out.println(onlineStatus);
        System.out.println("-----------");
    }
}