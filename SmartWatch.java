
class SmartWatch {
    int getPrice() {
        int price = 5000;
        System.out.println("Price is: " + price);
        return price;
    }
    void displayBrand(String brand) {
        System.out.println("Brand is: " + brand);
        int p = getPrice();
        System.out.println("Returned Price: " + p);
    }
    void showDetails() {
        System.out.println("Smart Watch details");
        displayBrand("Noise");
    }
}

