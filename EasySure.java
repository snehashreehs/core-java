class EasySure {

    static int checkAppliance(String item) {

        int price = 0;

        if ("refrigerator".equals(item)) {
            price = 30000;
        } else if ("washing machine".equals(item)) {
            price = 25000;
        } else if ("air conditioner".equals(item)) {
            price = 40000;
        } else if ("microwave".equals(item)) {
            price = 12000;
        } else if ("television".equals(item)) {
            price = 35000;
        } else if ("water purifier".equals(item)) {
            price = 15000;
        } else if ("ceiling fan".equals(item)) {
            price = 3000;
        } else if ("electric kettle".equals(item)) {
            price = 2000;
        } else if ("room heater".equals(item)) {
            price = 5000;
        } else if ("vacuum cleaner".equals(item)) {
            price = 8000;
        } else {
            System.out.println("Appliance not available");
            return 0;
        }

        System.out.println("Selected appliance: " + item);
        return price;
    }

    static int calculateTotal(int price, int qty) {

        if (price > 0 && qty > 0) {
            return price * qty;
        } else {
            System.out.println("Invalid purchase");
            return 0;
        }
    }
}