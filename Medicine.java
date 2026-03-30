class Medicine {

    public static void main(String[] args) {

        System.out.println("PARACETAMOL");

        addUses();

        System.out.println("Medicine stock details:");

        long tabletsInStore = 5000L;
        long tabletsSold = 3200L;
        boolean isPrescriptionNeeded = false;

        addStock(tabletsInStore, tabletsSold, isPrescriptionNeeded);

        int price = getPrice();
        System.out.println(price);

        System.out.println("************************");
    }

    static void addUses() {
        System.out.println("It is used to reduce fever");
        System.out.println("It helps to relieve pain");
        System.out.println("************************");
    }

    static void addStock(long store, long sold, boolean prescription) {
        System.out.println("Available tablets:");
        long available = store - sold;
        System.out.println(available);
        System.out.println("Prescription Needed: " + prescription);
        System.out.println("************************");
    }

    static int getPrice() {
        System.out.println("The price of the medicine is:");
        int medicinePrice = 25;
        System.out.println("Price received");
        return medicinePrice;
    }
}