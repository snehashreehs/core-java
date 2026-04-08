class BazaarNow {

    static int checkItem(String item) {

        int price = 0;

        if ("shirt".equals(item)) {
            price = 1200;
        } else if ("jeans".equals(item)) {
            price = 2000;
        } else if ("jacket".equals(item)) {
            price = 3500;
        } else if ("shoes".equals(item)) {
            price = 2500;
        } else if ("watch".equals(item)) {
            price = 1800;
        } else if ("bag".equals(item)) {
            price = 1500;
        } else if ("belt".equals(item)) {
            price = 600;
        } else if ("cap".equals(item)) {
            price = 400;
        } else if ("sunglasses".equals(item)) {
            price = 900;
        } else if ("wallet".equals(item)) {
            price = 700;
        } else {
            System.out.println("Item not found");
            return 0;
        }

        System.out.println("Selected item: " + item);
        return price;
    }

    static int generateBill(int price, int qty) {

        if (price > 0 && qty > 0) {
            return price * qty;
        } else {
            System.out.println("Invalid purchase");
            return 0;
        }
    }
}