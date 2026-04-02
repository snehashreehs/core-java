class ZaraRunner {
    public static void main(String[] args) {

        Zara z1 = new Zara("T-Shirt", "Men", 1299);
        Zara z2 = new Zara("Dress", "Women", 2499);
        Zara z3 = new Zara("Jeans", "Men", 1999);
        Zara z4 = new Zara("Jacket", "Women", 3499);
        Zara z5 = new Zara("Shirt", "Men", 1799);
        Zara z6 = new Zara("Skirt", "Women", 1599);
        Zara z7 = new Zara("Blazer", "Men", 3999);

        z1.display();
        z2.display();
        z3.display();
        z4.display();
        z5.display();
        z6.display();
        z7.display();
    }
}