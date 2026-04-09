class TV {

    int getPrice() {
        int price = 30000;
        System.out.println("Price is: " + price);
        return price;
    }

    void displayBrand(String brand) {
        System.out.println("Brand is: " + brand);
        int p = getPrice();
        System.out.println("Returned Price: " + p);
    }

    void showDetails() {
        System.out.println("TV details");
        displayBrand("LG");
    }
}


