class Mouse {

    int getPrice() {
        int price = 700;
        System.out.println("Price: " + price);
        return price;
    }

    void displayBrand(String brand) {
        System.out.println("Brand: " + brand);
        getPrice();
    }
}


