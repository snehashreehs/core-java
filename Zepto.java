class Zepto {

    static int checkGrocery(String item) {

        int price = 0;

        if ("milk".equals(item)) {
            price = 50;
        } else if ("bread".equals(item)) {
            price = 40;
        } else if ("eggs".equals(item)) {
            price = 90;
        } else if ("rice".equals(item)) {
            price = 60;
        } else if ("wheat flour".equals(item)) {
            price = 55;
        } else if ("sugar".equals(item)) {
            price = 45;
        } else if ("salt".equals(item)) {
            price = 20;
        } else if ("oil".equals(item)) {
            price = 150;
        } else if ("biscuits".equals(item)) {
            price = 30;
        } else if ("juice".equals(item)) {
            price = 70;
        } else {
            System.out.println("Item not available");
            return 0;
        }

        System.out.println("Selected grocery: " + item);
        return price;
    }

    static int totalCost(int price, int qty) {

        if (price > 0 && qty > 0) {
            return price * qty;
        } else {
            System.out.println("Invalid order");
            return 0;
        }
    }
}