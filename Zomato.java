class Zomato {

    static int checkFood(String item) {

        int price = 0;

        if ("burger".equals(item)) {
            price = 150;
        } else if ("pizza".equals(item)) {
            price = 300;
        } else if ("biryani".equals(item)) {
            price = 250;
        } else if ("noodles".equals(item)) {
            price = 180;
        } else if ("fried rice".equals(item)) {
            price = 200;
        } else if ("sandwich".equals(item)) {
            price = 120;
        } else if ("pasta".equals(item)) {
            price = 220;
        } else if ("shawarma".equals(item)) {
            price = 160;
        } else if ("rolls".equals(item)) {
            price = 140;
        } else if ("momos".equals(item)) {
            price = 130;
        } else {
            System.out.println("Item not available");
            return 0;
        }

        System.out.println("Selected item: " + item);
        return price;
    }

    static int totalBill(int price, int qty) {

        if (price > 0 && qty > 0) {
            return price * qty;
        } else {
            System.out.println("Invalid order");
            return 0;
        }
    }
}