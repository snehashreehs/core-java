class Speaker {

    public static void main(String[] args) {

        System.out.println("JBL Speaker");
        addFeatures();

        System.out.println("Sales from different cities");

        long bangalore = 50000L;
        long mysore = 25000L;
        boolean isBluetoothAvailable = true;

        addSales(bangalore, mysore, isBluetoothAvailable);

        int price = getPrice();
        System.out.println(price);

        System.out.println("************************");
    }

    static void addFeatures() {
        System.out.println("It has high bass sound");
        System.out.println("It supports Bluetooth connectivity");
        System.out.println("************************");
    }

    static void addSales(long city1, long city2, boolean bluetooth) {

        System.out.println("Total number of units sold");

        long totalSales = city1 + city2;
        System.out.println(totalSales);

        System.out.println("Bluetooth Available: " + bluetooth);
        System.out.println("************************");
    }

    static int getPrice() {

        System.out.println("The price of the speaker is");
        int speakerPrice = 3000;

        System.out.println("Price retrieved successfully");
        return speakerPrice;
    }
}