class Mobile {

    String brand;
    String model;
    int price;
    int ram;
    String color;

    public Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;

        System.out.println("Mobile: " + brand + " " + model);
    }

    public Mobile(String brand, String model, int price, int ram) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;

        System.out.println(brand + " " + model + " costs " + price + " with " + ram + "GB RAM");
    }

    public Mobile(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;

        System.out.println("New " + brand + " " + model + " available in " + color + " color");
    }
}