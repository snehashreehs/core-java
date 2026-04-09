class Router {
    int getPrice() {
        int price = 2500;
        System.out.println("Price is: " + price);
        return price;
    }
    void displayBrand(String brand) {
        System.out.println("Brand is: " + brand);
        int p = getPrice();
        System.out.println("Returned Price: " + p);
    }
    void showDetails() {
        System.out.println("Router details");
        displayBrand("TP-Link");
    }
}

