class Monkey {

    public static void main(String[] args) {

        System.out.println("FOREST MONKEY");

        addHabits();

        System.out.println("Monkey details:");

        long totalMonkeys = 150;
        long maleMonkeys = 80;
        boolean isHerbivore = false;

        addCount(totalMonkeys, maleMonkeys, isHerbivore);

        int lifeSpan = getLifeSpan();
        System.out.println(lifeSpan);

        System.out.println("************************");
    }

    static void addHabits() {
        System.out.println("It can climb trees easily");
        System.out.println("It likes to eat fruits");
        System.out.println("************************");
    }

    static void addCount(long total, long male, boolean herbivore) {
        System.out.println("Female monkeys:");
        long female = total - male;
        System.out.println(female);
        System.out.println("Is Herbivore: " + herbivore);
        System.out.println("************************");
    }

    static int getLifeSpan() {
        System.out.println("Average life span of monkey:");
        int years = 20;
        System.out.println("Life span received");
        return years;
    }
}