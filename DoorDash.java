class DoorDash {

    static int checkDish(String item) {

        int price = 0;

        if ("tacos".equals(item)) {
            price = 220;
        } else if ("pasta alfredo".equals(item)) {
            price = 300;
        } else if ("grilled chicken".equals(item)) {
            price = 350;
        } else if ("caesar salad".equals(item)) {
            price = 180;
        } else if ("ramen".equals(item)) {
            price = 260;
        } else if ("sushi".equals(item)) {
            price = 400;
        } else if ("steak".equals(item)) {
            price = 550;
        } else if ("dumplings".equals(item)) {
            price = 200;
        } else if ("quesadilla".equals(item)) {
            price = 240;
        } else if ("nachos".equals(item)) {
            price = 190;
        } else {
            System.out.println("Dish not available");
            return 0;
        }

        System.out.println("Selected dish: " + item);
        return price;
    }

    static int generateTotal(int price, int qty) {

        if (price > 0 && qty > 0) {
            return price * qty;
        } else {
            System.out.println("Invalid order");
            return 0;
        }
    }
}