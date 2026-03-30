class Volleyball {

    public static void main(String[] args) {

        System.out.println("VOLLEYBALL GAME");

        addRules();

        System.out.println("Match details:");

        int teamAScore = 25;
        int teamBScore = 18;
        boolean isFinalSet = false;

        addScore(teamAScore, teamBScore, isFinalSet);

        int players = getPlayersCount();
        System.out.println(players);

        System.out.println("************************");
    }

    static void addRules() {
        System.out.println("Each team has 6 players");
        System.out.println("Ball should not touch the ground");
        System.out.println("************************");
    }

    static void addScore(int scoreA, int scoreB, boolean finalSet) {
        System.out.println("Total points scored:");
        int total = scoreA + scoreB;
        System.out.println(total);
        System.out.println("Is Final Set: " + finalSet);
        System.out.println("************************");
    }

    static int getPlayersCount() {
        System.out.println("Number of players in one team:");
        int playersCount = 6;
        System.out.println("Players count received");
        return playersCount;
    }
}