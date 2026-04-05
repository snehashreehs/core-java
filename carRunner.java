class CarRunner {
    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println("------------------");

        Car c2 = new Car("SUV", 180);
        System.out.println("------------------");

        Car c3 = new Car("Hatchback", 140, "Blue");
        System.out.println("------------------");

        Car c4 = new Car("Convertible", 220, "Black", "Diesel");
        System.out.println("------------------");

        Car c5 = new Car("Sports Car", 300, "Yellow", "Petrol", "Ferrari");
    }
}