class ThreadExample {

    String threadType;
    String color;
    double length;
    int thickness;
    boolean isStrong;

    public static void main(String[] args) {

      ThreadExample t = new ThreadExample();

        t.threadType = "Cotton";
        t.color = "Red";
        t.length = 25.5;
        t.thickness = 2;
        t.isStrong = true;

        System.out.println("Before Renaming:");
        System.out.println("Type: " + t.threadType);
        System.out.println("Color: " + t.color);
        System.out.println("Length: " + t.length);
        System.out.println("Thickness: " + t.thickness);
        System.out.println("Strong: " + t.isStrong);

        t.threadType = "Silk";
        t.color = "Blue";

        System.out.println("After Renaming:");
        System.out.println("Type: " + t.threadType);
        System.out.println("Color: " + t.color);
    }
}