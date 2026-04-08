class McDonaldsRunner {

    public static void main(String[] args) {

        String item = "mc chicken";
        int qty = 3;

        int price = McDonalds.checkFood(item);
        int total = McDonalds.calculateTotal(price, qty);

        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: " + total);
    }
}