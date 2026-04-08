class GitDirectRunner {

    public static void main(String[] args) {

        String item = "laptop";
        int qty = 2;

        int price = GitDirect.checkProduct(item);
        int total = GitDirect.totalAmount(price, qty);

        System.out.println("Price per product: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Amount: " + total);
    }
}