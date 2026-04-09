class Television {

    int getPrice() {
        int price = 60000;
        System.out.println("Price: " + price);
        return price;
    }

    void displayBrand(String brand) {
        System.out.println("Brand: " + brand);
        getPrice();
    }
}


