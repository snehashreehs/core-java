class Customer {

    public static void main(String[] args) {

        // 3 arrays with 10 values each
        int[] customerID = {301, 302, 303, 304, 305, 306, 307, 308, 309, 310};

        String[] customerName = {
            "Alice", "Bob", "Charlie", "David", "Eva",
            "Frank", "Grace", "Hannah", "Ian", "Julia"
        };

        String[] email = {
            "alice@example.com", "bob@example.com", "charlie@example.com",
            "david@example.com", "eva@example.com", "frank@example.com",
            "grace@example.com", "hannah@example.com", "ian@example.com",
            "julia@example.com"
        };

        // Print using index loop
        System.out.println("Printing using Index Loop:");
        for (int i = 0; i < customerID.length; i++) {
            System.out.println("Customer ID: " + customerID[i] +
                               ", Name: " + customerName[i] +
                               ", Email: " + email[i]);
        }

        // Print using for-each loop
        System.out.println("\nCustomer IDs (For-Each Loop):");
        for (int id : customerID) {
            System.out.println(id);
        }

        System.out.println("\nCustomer Names (For-Each Loop):");
        for (String name : customerName) {
            System.out.println(name);
        }

        System.out.println("\nEmails (For-Each Loop):");
        for (String mail : email) {
            System.out.println(mail);
        }
    }
}