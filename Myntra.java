class Myntra {

    String productName;
    String brandName;
    int price;


    public Myntra() {
    }

   
    public Myntra(String productName, String brandName, int price) {
        this.productName = productName;
        this.brandName = brandName;
        this.price = price;
    }

    public void display() {
        System.out.println(productName);
        System.out.println(brandName);
        System.out.println(price);
        System.out.println("----------------------");
    }
}