class CourseraRunner {
    public static void main(String[] args) {

        Coursera c1 = new Coursera("Machine Learning", "Stanford", 120000);
        Coursera c2 = new Coursera("Data Science", "IBM", 95000);
        Coursera c3 = new Coursera("Cloud Computing", "Google", 80000);
        Coursera c4 = new Coursera("Python for Everybody", "Michigan", 150000);
        Coursera c5 = new Coursera("AI Basics", "DeepLearning.AI", 70000);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
    }
}