class Teacher {

    String name;
    String subject;
    int salary;
    int experience;
    String school;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;

        System.out.println("Teacher: " + name + " teaches " + subject);
    }


    public Teacher(String name, String subject, int salary, int experience) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
        this.experience = experience;

        System.out.println(name + " teaches " + subject + " earning " + salary + " with " + experience + " years experience");
   }
   
    public Teacher(String name, String subject, String school) {
        this.name = name;
        this.subject = subject;
        this.school = school;

        System.out.println(name + " teaches " + subject + " at " + school);
    }
}