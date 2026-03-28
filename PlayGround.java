class PlayGround {
    public static void main(String[] args) {

        String playgroundName;
        String location;
        int areaInSqMeters;
        int numberOfGames;
        boolean hasLighting;

        playgroundName = "Green Park";
        location = "Bangalore";
        areaInSqMeters = 5000;
        numberOfGames = 6;
        hasLighting = true;

        System.out.println("Playground Name: " + playgroundName);
        System.out.println("Location: " + location);
        System.out.println("Area (sq meters): " + areaInSqMeters);
        System.out.println("Number of Games: " + numberOfGames);
        System.out.println("Has Lighting: " + hasLighting);

        playgroundName = "City Sports Ground";
        location = "Chennai";

        System.out.println("Playground Name: " + playgroundName);
        System.out.println("Location: " + location);
    }
}