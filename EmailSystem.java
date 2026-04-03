class EmailSystem {

    String sender;
    String receiver;
    String subject;
    int attachmentSize;
    String label;

    public EmailSystem(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;

        System.out.println("Email sent from " + sender + " to " + receiver);
    }

    public EmailSystem(String sender, String receiver, String subject, int attachmentSize) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.attachmentSize = attachmentSize;

        System.out.println(sender + " sent an email with subject: " + subject);
    }

    public EmailSystem(String sender, String receiver, String label) {
        this.sender = sender;
        this.receiver = receiver;
        this.label = label;

        System.out.println("Important Email: " + sender + " marked as " + label);
    }
}