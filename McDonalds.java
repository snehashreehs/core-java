class McDonalds {

    static int checkFood(String item) {

        int price = 0;

        if ("mc burger".equals(item)) {
            price = 120;
        } else if ("mc chicken".equals(item)) {
            price = 150;
        } else if ("fries".equals(item)) {
            price = 100;
        } else if ("nuggets".equals(item)) {
            price = 180;
        } else if ("mc wrap".equals(item)) {
            price = 200;
        } else if ("mc pizza".equals(item)) {
            price = 250;
        } else if ("cold coffee".equals(item)) {
            price = 140;
        } else if ("soft drink".equals(item)) {
            price = 90;
        } else if ("ice cream".equals(item)) {
            price = 80;
        } else if ("combo meal".equals(item)) {
            price = 300;
        } else {
            System.out.println("Item not available");
            return 0;
        }

        System.out.println("Selected item: " + item);
        return price;
    }

    static int calculateTotal(int price, int qty) {

        if (price > 0 && qty > 0) {
            return price * qty;
        } else {
            System.out.println("Invalid order");
            return 0;
        }
    }
}