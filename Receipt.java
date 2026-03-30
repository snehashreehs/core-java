class Receipt {

    public static void main(String[] args) {

        // 3 arrays with 10 values each
        int[] receiptID = {501, 502, 503, 504, 505, 506, 507, 508, 509, 510};

        int[] paymentID = {401, 402, 403, 404, 405, 406, 407, 408, 409, 410};

        double[] amount = {250.50, 480.00, 300.75, 150.25, 600.00, 750.60, 820.80, 430.30, 990.00, 1200.00};

        // Print using index loop
        System.out.println("Printing using Index Loop:");
        for (int i = 0; i < receiptID.length; i++) {
            System.out.println("Receipt ID: " + receiptID[i] +
                               ", Payment ID: " + paymentID[i] +
                               ", Amount: " + amount[i]);
        }

        // Print using for-each loop
        System.out.println("\nReceipt IDs (For-Each Loop):");
        for (int rID : receiptID) {
            System.out.println(rID);
        }

        System.out.println("\nPayment IDs (For-Each Loop):");
        for (int pID : paymentID) {
            System.out.println(pID);
        }

        System.out.println("\nAmounts (For-Each Loop):");
        for (double amt : amount) {
            System.out.println(amt);
        }
    }
}