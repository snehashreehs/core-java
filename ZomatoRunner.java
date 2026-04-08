class ZomatoRunner {

    public static void main(String[] args) {

        String item = "biryani";
        int qty = 3;

        int price = Zomato.checkFood(item);
        int bill = Zomato.totalBill(price, qty);

        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: " + bill);
    }
}