class Actor {

    public static void main(String[] args) {

        System.out.println("FAMOUS ACTOR");

        addDetails();

        System.out.println("Movie details:");

        int totalMovies = 50;
        int hitMovies = 35;
        boolean isAwardWinner = true;

        addMovies(totalMovies, hitMovies, isAwardWinner);

        int age = getAge();
        System.out.println(age);

        System.out.println("************************");
    }

    static void addDetails() {
        System.out.println("He works in film industry");
        System.out.println("He performs different roles");
        System.out.println("************************");
    }

    static void addMovies(int total, int hits, boolean award) {
        System.out.println("Flop movies:");
        int flop = total - hits;
        System.out.println(flop);
        System.out.println("Award Winner: " + award);
        System.out.println("************************");
    }

    static int getAge() {
        System.out.println("Age of the actor:");
        int actorAge = 40;
        System.out.println("Age received");
        return actorAge;
    }
}