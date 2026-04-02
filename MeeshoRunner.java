class MeeshoRunner {
    public static void main(String[] args) {

        Meesho m1 = new Meesho("Kurti", "RaviStore", 599);
        Meesho m2 = new Meesho("Saree", "AnuFashion", 1299);
        Meesho m3 = new Meesho("Tshirt", "KiranWear", 399);
        Meesho m4 = new Meesho("Jeans", "SnehaStyle", 899);
        Meesho m5 = new Meesho("Shoes", "ArjunMart", 1499);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
    }
}