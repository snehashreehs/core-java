class ZeptoRunner {

    public static void main(String[] args) {

        String item = "milk";
        int qty = 4;

        int price = Zepto.checkGrocery(item);
        int total = Zepto.totalCost(price, qty);

        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Cost: " + total);
    }
}