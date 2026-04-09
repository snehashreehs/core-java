class Printer {

    int getPrice() {
        int price = 8000;
        System.out.println("Price: " + price);
        return price;
    }

    void displayType(String type) {
        System.out.println("Type: " + type);
        getPrice();
    }
}



