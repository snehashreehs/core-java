class Account {

    public static void main(String[] args) {

        // Declare 3 arrays with 10 values each
        int[] accountNumber = {101,102,103,104,105,106,107,108,109,110};

        String[] accountHolder = {
            "Amit","Rahul","Priya","Neha","Ravi",
            "Anita","Kiran","Suresh","Pooja","Vikas"
        };

        double[] balance = {
            5000.50, 6200.75, 7100.00, 4500.25, 9800.90,
            3000.60, 8400.40, 1500.00, 6700.80, 9200.10
        };

        // Print using index loop
        System.out.println("Printing using Index Loop:");
        for (int i = 0; i < accountNumber.length; i++) {
            System.out.println("Account No: " + accountNumber[i] +
                    " Name: " + accountHolder[i] +
                    " Balance: " + balance[i]);
        }

        // Print using for-each loop
        System.out.println("\nAccount Numbers (For-Each Loop):");
        for (int num : accountNumber) {
            System.out.println(num);
        }

        System.out.println("\nAccount Holders (For-Each Loop):");
        for (String name : accountHolder) {
            System.out.println(name);
        }

        System.out.println("\nBalances (For-Each Loop):");
        for (double bal : balance) {
            System.out.println(bal);
        }
    }
}