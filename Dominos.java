class Dominos {

    static int checkItem(String item) {

        int price = 0;

        if ("pepperoni".equals(item)) {
            price = 450;
        } else if ("bbq chicken".equals(item)) {
            price = 500;
        } else if ("cheese burst".equals(item)) {
            price = 480;
        } else if ("veg extravaganza".equals(item)) {
            price = 420;
        } else if ("paneer tikka".equals(item)) {
            price = 400;
        } else if ("mexican green wave".equals(item)) {
            price = 380;
        } else if ("farm veggie".equals(item)) {
            price = 350;
        } else if ("double cheese".equals(item)) {
            price = 360;
        } else if ("spicy chicken".equals(item)) {
            price = 520;
        } else if ("deluxe veggie".equals(item)) {
            price = 410;
        } else {
            System.out.println("Item not available");
            return 0;
        }

        System.out.println("Selected item: " + item);
        return price;
    }

    static int calculateBill(int price, int quantity) {

        if (price > 0 && quantity > 0) {
            return price * quantity;
        } else {
            System.out.println("Invalid order");
            return 0;
        }
    }
}