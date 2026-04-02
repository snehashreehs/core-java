class Coursera {

    String courseTitle;
    String university;
    int enrolledCount;

    public Coursera() {
    }

    public Coursera(String courseTitle, String university, int enrolledCount) {
        this.courseTitle = courseTitle;
        this.university = university;
        this.enrolledCount = enrolledCount;
    }

 
    public void display() {
        System.out.println(courseTitle);
        System.out.println(university);
        System.out.println(enrolledCount);
        System.out.println("----------------------");
    }
}