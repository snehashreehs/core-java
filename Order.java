class Order {
    public static void main(String[] args) {

        int orderId;
        String customerName;
        String productName;
        int quantity;
        double totalAmount;
		
        orderId = 101;
        customerName = "Sneha";
        productName = "Laptop";
        quantity = 2;
        totalAmount = 90000.50;

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);

        customerName = "Pavithra";
        productName = "Mobile";

        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
    }
}