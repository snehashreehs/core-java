class Country {

    public static void main(String[] args) {

        System.out.println("INDIA");

        addDetails();

        System.out.println("Population details:");

        long malePopulation = 700000000L;
        long femalePopulation = 650000000L;
        boolean isDeveloping = true;

        addPopulation(malePopulation, femalePopulation, isDeveloping);

        int states = getStatesCount();
        System.out.println(states);

        System.out.println("************************");
    }

    static void addDetails() {
        System.out.println("It has rich cultural heritage");
        System.out.println("It is the largest democracy");
        System.out.println("************************");
    }

    static void addPopulation(long male, long female, boolean developing) {
        System.out.println("Total population:");
        long total = male + female;
        System.out.println(total);
        System.out.println("Is Developing Country: " + developing);
        System.out.println("************************");
    }

    static int getStatesCount() {
        System.out.println("Number of states in the country:");
        int statesCount = 28;
        System.out.println("States count received");
        return statesCount;
    }
}