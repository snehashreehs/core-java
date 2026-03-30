public class Payment {

    public static void main(String[] args) {

        // 3 arrays with 10 values each
        int[] paymentID = {401, 402, 403, 404, 405, 406, 407, 408, 409, 410};

        int[] customerID = {301, 302, 303, 304, 305, 306, 307, 308, 309, 310};

        double[] amount = {250.50, 480.00, 300.75, 150.25, 600.00, 750.60, 820.80, 430.30, 990.00, 1200.00};

        // Print using index loop
        System.out.println("Printing using Index Loop:");
        for (int i = 0; i < paymentID.length; i++) {
            System.out.println("Payment ID: " + paymentID[i] +
                               ", Customer ID: " + customerID[i] +
                               ", Amount: " + amount[i]);
        }

        // Print using for-each loop
        System.out.println("\nPayment IDs (For-Each Loop):");
        for (int id : paymentID) {
            System.out.println(id);
        }

        System.out.println("\nCustomer IDs (For-Each Loop):");
        for (int cust : customerID) {
            System.out.println(cust);
        }

        System.out.println("\nAmounts (For-Each Loop):");
        for (double amt : amount) {
            System.out.println(amt);
        }
    }
}