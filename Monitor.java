class Monitor {

    public static void main(String[] args) {

        System.out.println("Dell Monitor");
        addFeatures();

        System.out.println("Sales from different cities");

        long bangalore = 40000L;
        long mysore = 20000L;
        boolean isHD = true;

        addSales(bangalore, mysore, isHD);

        int price = getPrice();
        System.out.println(price);

        System.out.println("************************");
    }

    static void addFeatures() {
        System.out.println("It has Full HD display");
        System.out.println("It supports HDMI connectivity");
        System.out.println("************************");
    }

    static void addSales(long city1, long city2, boolean isHD) {

        System.out.println("Total number of monitors sold");

        long totalSales = city1 + city2;
        System.out.println(totalSales);

        System.out.println("HD Display: " + isHD);
        System.out.println("************************");
    }

    static int getPrice() {

        System.out.println("The price of the monitor is");
        int monitorPrice = 12000;

        System.out.println("Price retrieved successfully");
        return monitorPrice;
    }
}