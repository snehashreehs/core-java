class Product {

    public static void main(String[] args) {

        // Array 1
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        // Array 2
        String names[] = {"Pen","Pencil","Book","Bag","Scale","Eraser","Marker","Sharpener","Notebook","Folder"};

        // Array 3
        double prices[] = {10.5,5.0,50.0,300.0,15.0,3.0,25.0,8.0,60.0,20.0};

        System.out.println("Printing using Index (for loop)");

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " " + names[i] + " " + prices[i]);
        }

        System.out.println("\nPrinting numbers using forEach loop");
        for(int n : numbers) {
            System.out.println(n);
        }

        System.out.println("\nPrinting names using forEach loop");
        for(String n : names) {
            System.out.println(n);
        }

        System.out.println("\nPrinting prices using forEach loop");
        for(double p : prices) {
            System.out.println(p);
        }
    }
}