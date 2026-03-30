class Magazine {

    public static void main(String[] args) {

        System.out.println("INDIA TODAY");
        addArticles();

        System.out.println("No of subscribers from different cities");

        long bangalore = 150000L;
        long mysore = 70000L;
        boolean isPopular = true;

        addSubscribers(bangalore, mysore, isPopular);

        int priceOfMagazine = getCurrentPrice();
        System.out.println(priceOfMagazine);

        System.out.println("************************");
    }

    static void addArticles() {
        System.out.println("It has latest articles");
        System.out.println("It is the best magazine to read weekly news");
        System.out.println("************************");
    }

    static void addSubscribers(long city1, long city2, boolean isPopular) {

        System.out.println("Total number of subscribers");

        long total = city1 + city2;

        System.out.println(total);
        System.out.println(isPopular);
        System.out.println("************************");
    }

    static int getCurrentPrice() {

        System.out.println("The price of the magazine is");
        int price = 25;
        System.out.println("Price updated");

        return price;
    }
}