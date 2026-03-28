class Printer {

    String brand;
    String model;
    double price;
    boolean isColor;
    int warrantyYears;

    public static void main(String[] args) {

        Printer p = new Printer();
		
        p.brand = "HP";
        p.model = "LaserJet 1020";
        p.price = 15000.50;
        p.isColor = false;
        p.warrantyYears = 2;

        System.out.println("Brand: " + p.brand);
        System.out.println("Model: " + p.model);
        System.out.println("Price: " + p.price);
        System.out.println("Color Printer: " + p.isColor);
        System.out.println("Warranty: " + p.warrantyYears);

        p.brand = "Canon";
        p.model = "Pixma G301
		
        System.out.println("Brand: " + p.brand);
        System.out.println("Model: " + p.model);
    }
}