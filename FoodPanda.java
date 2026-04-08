class FoodPanda {

    static int checkMeal(String item) {

        int price = 0;

        if ("veg thali".equals(item)) {
            price = 180;
        } else if ("chicken biryani".equals(item)) {
            price = 280;
        } else if ("paneer butter masala".equals(item)) {
            price = 240;
        } else if ("masala dosa".equals(item)) {
            price = 120;
        } else if ("idli vada".equals(item)) {
            price = 100;
        } else if ("fried chicken".equals(item)) {
            price = 260;
        } else if ("hakka noodles".equals(item)) {
            price = 200;
        } else if ("veg fried rice".equals(item)) {
            price = 190;
        } else if ("chole bhature".equals(item)) {
            price = 160;
        } else if ("gulab jamun".equals(item)) {
            price = 90;
        } else {
            System.out.println("Meal not available");
            return 0;
        }

        System.out.println("Selected meal: " + item);
        return price;
    }

    static int calculateBill(int price, int qty) {

        if (price > 0 && qty > 0) {
            return price * qty;
        } else {
            System.out.println("Invalid order");
            return 0;
        }
    }
}