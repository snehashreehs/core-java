class Transaction {

    public static void main(String[] args) {

        // 3 arrays with 10 values each
        int[] transactionID = {201, 202, 203, 204, 205, 206, 207, 208, 209, 210};

        int[] accountNumber = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};

        double[] amount = {500.50, 1200.00, 750.75, 980.25, 450.00, 660.60, 880.80, 300.30, 1500.00, 2000.00};

        // Print using index loop
        System.out.println("Printing using Index Loop:");
        for (int i = 0; i < transactionID.length; i++) {
            System.out.println("Transaction ID: " + transactionID[i] +
                               ", Account No: " + accountNumber[i] +
                               ", Amount: " + amount[i]);
        }

        // Print using for-each loop
        System.out.println("\nTransaction IDs (For-Each Loop):");
        for (int id : transactionID) {
            System.out.println(id);
        }

        System.out.println("\nAccount Numbers (For-Each Loop):");
        for (int acc : accountNumber) {
            System.out.println(acc);
        }

        System.out.println("\nAmounts (For-Each Loop):");
        for (double amt : amount) {
            System.out.println(amt);
        }
    }
}