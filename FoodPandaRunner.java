class FoodPandaRunner {

    public static void main(String[] args) {

        String item = "chicken biryani";
        int qty = 2;

        int price = FoodPanda.checkMeal(item);
        int total = FoodPanda.calculateBill(price, qty);

        System.out.println("Price per meal: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: " + total);
    }
}