class Fan {

    int getPrice() {
        int price = 2500;
        System.out.println("Price: " + price);
        return price;
    }

    void displayBrand(String brand) {
        System.out.println("Brand: " + brand);
        getPrice();
    }
}



