class ZomatoRunner {
    public static void main(String[] args) {

        Zomato obj1 = new Zomato("Chicken Biryani", "Hyderabadi House", 250);
        obj1.display();

        Zomato obj2 = new Zomato("Veg Thali", "Annapurna Meals", 150);
        obj2.display();

        Zomato obj3 = new Zomato("Pav Bhaji", "Mumbai Street", 120);
        obj3.display();

        Zomato obj4 = new Zomato("Tandoori Chicken", "Grill Master", 300);
        obj4.display();

        Zomato obj5 = new Zomato("Chole Bhature", "Punjabi Dhaba", 130);
        obj5.display();

        Zomato obj6 = new Zomato("Noodles", "Dragon Wok", 140);
        obj6.display();

        Zomato obj7 = new Zomato("Brownie", "Dessert Zone", 110);
        obj7.display();
    }
}