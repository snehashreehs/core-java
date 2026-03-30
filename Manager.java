class Manager {

    public static void main(String[] args) {

        // 3 arrays with 10 values each
        int[] managerID = {601, 602, 603, 604, 605, 606, 607, 608, 609, 610};

        String[] managerName = {
            "John", "Emma", "Michael", "Sophia", "Daniel",
            "Olivia", "David", "Ava", "James", "Mia"
        };

        String[] department = {
            "Finance", "HR", "IT", "Marketing", "Sales",
            "Operations", "Logistics", "R&D", "Support", "Admin"
        };

        // Print using index loop
        System.out.println("Printing using Index Loop:");
        for (int i = 0; i < managerID.length; i++) {
            System.out.println("Manager ID: " + managerID[i] +
                               ", Name: " + managerName[i] +
                               ", Department: " + department[i]);
        }

        // Print using for-each loop
        System.out.println("\nManager IDs (For-Each Loop):");
        for (int id : managerID) {
            System.out.println(id);
        }

        System.out.println("\nManager Names (For-Each Loop):");
        for (String name : managerName) {
            System.out.println(name);
        }

        System.out.println("\nDepartments (For-Each Loop):");
        for (String dept : department) {
            System.out.println(dept);
        }
    }
}