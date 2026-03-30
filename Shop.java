class Shop {

    public static void main(String[] args) {

        System.out.println("SUPER MARKET SHOP");
        addItems();

        long item1 = 500L;
        long item2 = 700L;
        boolean discountAvailable = true;

        addStock(item1, item2, discountAvailable);

        int price = getItemPrice();
        System.out.println(price);
        System.out.println("************************");
    }

    static void addItems() {
        System.out.println("Shop sells groceries and vegetables");
        System.out.println("Fresh items available daily");
        System.out.println("************************");
    }

    static void addStock(long s1, long s2, boolean discount) {
        System.out.println("Total Stock");
        long total = s1 + s2;
        System.out.println(total);
        System.out.println(discount);
        System.out.println("************************");
    }

    static int getItem