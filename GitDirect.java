class GitDirect {

    static int checkProduct(String item) {

        int price = 0;

        if ("laptop".equals(item)) {
            price = 55000;
        } else if ("mobile".equals(item)) {
            price = 20000;
        } else if ("tablet".equals(item)) {
            price = 15000;
        } else if ("smartwatch".equals(item)) {
            price = 8000;
        } else if ("headphones".equals(item)) {
            price = 3000;
        } else if ("keyboard".equals(item)) {
            price = 1200;
        } else if ("mouse".equals(item)) {
            price = 800;
        } else if ("monitor".equals(item)) {
            price = 10000;
        } else if ("printer".equals(item)) {
            price = 7000;
        } else if ("speaker".equals(item)) {
            price = 2500;
        } else {
            System.out.println("Product not available");
            return 0;
        }

        System.out.println("Selected product: " + item);
        return price;
    }

    static int totalAmount(int price, int qty) {

        if (price > 0 && qty > 0) {
            return price * qty;
        } else {
            System.out.println("Invalid order");
            return 0;
        }
    }
}