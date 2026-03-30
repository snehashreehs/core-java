class Bag {
    public static void main(String[] args) {
        System.out.println("VIJAYA KARNATAKA");
        addNews();
        System.out.println("no of readers from different distic");

        long mandya = 100000L;
        long maddur = 50000L;
        boolean isUnderstandable = true;
        addPeoples(mandya, maddur, isUnderstandable);

        int priceOfPaper = getPresentPrice();
        System.out.println(priceOfPaper);
        System.out.println("***************************");
    }

    static void addNews() {
        System.out.println("it has exact news");
        System.out.println("it is the best paper for get a daily news");
        System.out.println("***************************");
    }

    static void addPeoples(long sugarcity, long maddur, boolean isUnderstandable) {
        System.out.println("total no of readers");
        long readers = sugarcity + maddur;
        System.out.println(readers);
        System.out.println(isUnderstandable);
        System.out.println("***************************");
    }

    static int getPresentPrice() {
        System.out.println("the price of the paper is");
        int paperPrice = 5; // Added a value here to avoid compilation error
        System.out.println("i got a price");
        return paperPrice;
    }
}