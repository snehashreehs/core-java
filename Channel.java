class Channel {

    public static void main(String[] args) {

        System.out.println("NEWS CHANNEL");

        addProgramDetails();

        System.out.println("Channel statistics:");

        int totalShows = 15;
        int liveShows = 5;
        boolean isHD = true;

        addShows(totalShows, liveShows, isHD);

        int subscribers = getSubscribersCount();
        System.out.println(subscribers);

        System.out.println("************************");
    }

    static void addProgramDetails() {
        System.out.println("It broadcasts daily news");
        System.out.println("It also telecasts debate programs");
        System.out.println("************************");
    }

    static void addShows(int total, int live, boolean hd) {
        System.out.println("Recorded shows:");
        int recorded = total - live;
        System.out.println(recorded);
        System.out.println("Is HD Channel: " + hd);
        System.out.println("************************");
    }

    static int getSubscribersCount() {
        System.out.println("Total subscribers of channel:");
        int subscriberCount = 1000000;
        System.out.println("Subscriber count received");
        return subscriberCount;
    }
}