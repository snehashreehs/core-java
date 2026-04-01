class Amazone {

    String accountName;
    String emailId;
    int ordersCount;
    long contactNumber;
    boolean primeMember;

    public Amazone(String a, String b, int c, long d, boolean e) {
        accountName = a;
        emailId = b;
        ordersCount = c;
        contactNumber = d;
        primeMember = e;
    }

    public void showDetails() {
        System.out.println(accountName);
        System.out.println(emailId);
        System.out.println(ordersCount);
        System.out.println(contactNumber);
        System.out.println(primeMember);
        System.out.println("-----------");
    }
}