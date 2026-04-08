class EasySureRunner {

    public static void main(String[] args) {

        String item = "television";
        int qty = 1;

        int price = EasySure.checkAppliance(item);
        int total = EasySure.calculateTotal(price, qty);

        System.out.println("Price per appliance: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: " + total);
    }
}