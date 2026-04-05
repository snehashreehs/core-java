class BuildingRunner {


    public static void main(String[] args) {

        Building b1 = new Building();

        System.out.println("------------------");

        Building b2 = new Building("Green Heights", 15);

        System.out.println("------------------");

        Building b3 = new Building("Tech Park", 10, "Commercial");

        System.out.println("------------------");

        Building b4 = new Building("City Mall", 8, "Shopping", "Steel");

        System.out.println("------------------");

        Building b5 = new Building("Ocean View", 25, "Luxury", "Glass", "Dubai");
    }
}