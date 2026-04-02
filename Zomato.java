class Zomato {

    String dishName;
    String restaurantName;
    int price;


    public Zomato() {
    }


    public Zomato(String dishName, String restaurantName, int price) {
        this.dishName = dishName;
        this.restaurantName = restaurantName;
        this.price = price;
    }

   
    public void display() {
        System.out.println(dishName);
        System.out.println(restaurantName);
        System.out.println(price);
        System.out.println("----------------------");
    }
}