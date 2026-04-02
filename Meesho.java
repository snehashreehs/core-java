class Meesho {

    String itemName;
    String sellerName;
    int cost;

    public Meesho() {
    }

    public Meesho(String itemName, String sellerName, int cost) {
        this.itemName = itemName;
        this.sellerName = sellerName;
        this.cost = cost;
    }

    public void display() {
        System.out.println(itemName);
        System.out.println(sellerName);
        System.out.println(cost);
        System.out.println("----------------------");
    }
}