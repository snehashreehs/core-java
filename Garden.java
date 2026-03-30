class Garden {

    public static void main(String[] args) {

        System.out.println("MY BEAUTIFUL GARDEN");
        addPlants();
        System.out.println("Visitors from different cities");

        long city1 = 2000L;
        long city2 = 1500L;
        boolean isClean = true;

        addVisitors(city1, city2, isClean);

        int entryFee = getEntryFee();
        System.out.println(entryFee);
        System.out.println("************************");
    }

    static void addPlants() {
        System.out.println("Different types of flowers");
        System.out.println("Green and clean environment");
        System.out.println("************************");
    }

    static void addVisitors(long city1, long city2, boolean isClean) {
        System.out.println("Total visitors:");
        long total = city1;
   }
}