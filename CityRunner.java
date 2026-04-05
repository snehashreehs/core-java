class CityRunner {

    public static void main(String[] args) {

        City c1 = new City();

        System.out.println("------------------");

        City c2 = new City("Mumbai", 20000000);

        System.out.println("------------------");

        City c3 = new City("Delhi", 19000000, "Delhi");

        System.out.println("------------------");

        City c4 = new City("Hyderabad", 10000000, "Telangana", "Biryani");

        System.out.println("------------------");

        City c5 = new City("Chennai", 8000000, "Tamil Nadu", "Marina Beach", "India");
    }
}