class DoorDashRunner {

    public static void main(String[] args) {

        String item = "ramen";
        int qty = 2;

        int price = DoorDash.checkDish(item);
        int total = DoorDash.generateTotal(price, qty);

        System.out.println("Price per dish: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: " + total);
    }
}