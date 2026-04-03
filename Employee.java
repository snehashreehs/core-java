class Employee{
 String name;
 String department;
 String position;
 long employeeId;
 double salary;
 
 public Employee(String name,String department,String position,long employeeId,double salary){
   this.name=name;
   this.department=department;
   this.position=position;
   this.employeeId=employeeId;
   this.salary=salary;
   System.out.println("registration has completed");
   
   }
 public Employee(String name, long employeeId){
   this.name=name;
   this.employeeId=employeeId;
   System.out.println(name+ ",you have  logged into the HR portal successfully.");
   }
   
   public Employee(String name){
   this.name=name;
   System.out.println("Fetching profile for:"+ name);
   
   }
   
   
   }
