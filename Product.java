class Product {

    String name;
    String brand;
    int price;
    double rating;
    String category;

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;

        System.out.println("Product: " + name + " by " + brand);
    }


    public Product(String name, String brand, int price, double rating) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.rating = rating;

        System.out.println(name + " costs " + price + " with rating " + rating);
    
	}
	
    public Product(String name, String brand, String category) {
        this.name = name;
        this.brand = brand;
        this.category = category;

        System.out.println("New " + category + " product: " + name + " from " + brand);
    }
}