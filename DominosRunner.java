class DominosRunner {

    public static void main(String[] args) {

        String item = "cheese burst";
        int quantity = 2;

        int price = Dominos.checkItem(item);
        int total = Dominos.calculateBill(price, quantity);

        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + total);
    }
}