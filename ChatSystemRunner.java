class ChatSystemRunner {
    public static void main(String[] args) {

        ChatSystem c1 = new ChatSystem();

        System.out.println("------------------");

        ChatSystem c2 = new ChatSystem("Telegram", 1500);

        System.out.println("------------------");

        ChatSystem c3 = new ChatSystem("Signal", 800, "Media");

        System.out.println("------------------");

        ChatSystem c4 = new ChatSystem("Messenger", 1200, "Video", "Standard");

        System.out.println("------------------");

        ChatSystem c5 = new ChatSystem("Slack", 600, "File Sharing", "High", "USA");
    }
}