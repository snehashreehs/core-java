class Zara {

    String itemName;
    String category;
    int price;

    public Zara(String itemName, String category, int price) {
        this.itemName = itemName;
        this.category = category;
        this.price = price;
    }

    public void display() {
        System.out.println(itemName);
        System.out.println(category);
        System.out.println(price);
        System.out.println("----------------------");
    }
}