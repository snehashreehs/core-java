class BirdRunner {
    public static void main(String[] args) {

        Bird b1 = new Bird();

        System.out.println("------------------");

        Bird b2 = new Bird("Eagle", 200);

        System.out.println("------------------");

        Bird b3 = new Bird("Peacock", 150, "Blue");

        System.out.println("------------------");

        Bird b4 = new Bird("Crow", 60, "Black", "Omnivore");

        System.out.println("------------------");

        Bird b5 = new Bird("Sparrow", 30, "Brown", "Grains", "Urban Areas");
    }
}