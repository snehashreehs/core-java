class Invoice {

    public static void main(String[] args) {

        String invoiceNumber;
        String customerName;
        String productName;
        int quantity;
        double totalAmount;

        invoiceNumber = "INV101";
        customerName = "Sneha";
        productName = "Laptop";
        quantity = 2;
        totalAmount = 80000.00;

        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);

        invoiceNumber = "INV202";
        customerName = "Pavithra";
        productName = "Mobile";
        quantity = 1;
        totalAmount = 25000.0;
		
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);
    }
}