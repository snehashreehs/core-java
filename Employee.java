public class Employee {
	
    public static void main(String[] args) {

        String empName;
        int empId;
        double salary;
 
        empName = "Ravi";
        empId = 101;
        salary = 25000.50;

        System.out.println("Initial Name: " + empName);
        System.out.println("Initial ID: " + empId);
        System.out.println("Initial Salary: " + salary);

        empName = "Kiran"; 
        empId = 202;         
        salary = 30000.75;   

        System.out.println("Updated Name: " + empName);
        System.out.println("Updated ID: " + empId);
        System.out.println("Updated Salary: " + salary);
    }
}