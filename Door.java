class Door {

    public static void main(String[] args) {

        System.out.println("MAIN DOOR");

        addDesign();

        System.out.println("Door details:");

        long height = 7;
        long width = 3;
        boolean isWooden = true;

        addSize(height, width, isWooden);

        int price = getPrice();
        System.out.println(price);

        System.out.println("************************");
    }

    static void addDesign() {
        System.out.println("It has strong lock system");
        System.out.println("It gives good security");
        System.out.println("************************");
    }

    static void addSize(long height, long width, boolean wooden) {
        System.out.println("Total area of door:");
        long area = height * width;
        System.out.println(area + " sq.ft");
        System.out.println("Is Wooden: " + wooden);
        System.out.println("************************");
    }

    static int getPrice() {
        System.out.println("The price of the door is:");
        int doorPrice = 8000;
        System.out.println("Price received");
        return doorPrice;
    }
}