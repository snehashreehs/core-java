class SecurityManager {

    public static void main(String[] args) {

        String managerName;
        int managerId;
        double salary;
        String department;
        boolean isActive;

        managerName = "Ravi Kumar";
        managerId = 101;
        salary = 55000.50;
        department = "Cyber Security";
        isActive = true;

        System.out.println("Name: " + managerName);
        System.out.println("ID: " + managerId);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Active: " + isActive);
		
        managerName = "Anjali Sharma";
        department = "Network Security";
        salary = 60000.75;
        managerId = 102;
        isActive = false;

        System.out.println("Name: " + managerName);
        System.out.println("ID: " + managerId);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Active: " + isActive);
    }
}