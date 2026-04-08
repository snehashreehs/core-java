class BazaarNowRunner {

    public static void main(String[] args) {

        String item = "jacket";
        int qty = 2;

        int price = BazaarNow.checkItem(item);
        int total = BazaarNow.generateBill(price, qty);

        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: " + total);
    }
}