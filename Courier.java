class Courier {

    public static void main(String[] args) {

        System.out.println("FAST TRACK COURIER");

        addServiceDetails();

        System.out.println("Delivery details:");

        long parcelsReceived = 1200L;
        long parcelsDelivered = 950L;
        boolean isExpressService = true;

        addDelivery(parcelsReceived, parcelsDelivered, isExpressService);

        int deliveryCharge = getDeliveryCharge();
        System.out.println(deliveryCharge);

        System.out.println("************************");
    }

    static void addServiceDetails() {
        System.out.println("It provides door to door service");
        System.out.println("It delivers parcels safely");
        System.out.println("************************");
    }

    static void addDelivery(long received, long delivered, boolean express) {
        System.out.println("Pending parcels:");
        long pending = received - delivered;
        System.out.println(pending);
        System.out.println("Express Service: " + express);
        System.out.println("************************");
    }

    static int getDeliveryCharge() {
        System.out.println("Delivery charge per parcel:");
        int charge = 50;
        System.out.println("Charge received");
        return charge;
    }
}