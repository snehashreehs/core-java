class Keyboard {

    int getPrice() {
        int price = 1500;
        System.out.println("Price: " + price);
        return price;
    }

    void displayType(String type) {
        System.out.println("Type: " + type);
        getPrice();
    }
}


