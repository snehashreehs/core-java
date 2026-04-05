class Bird {

    String birdName;
    int wingSpan;
    String featherColor;
    String foodType;
    String habitatPlace;

   
    Bird() {
        this("Parrot", 25);
        System.out.println("Default Constructor");
    }

   
    Bird(String birdName, int wingSpan) {
        this(birdName, wingSpan, "Green");
        System.out.println("Two Argument Constructor");
    }

   
    Bird(String birdName, int wingSpan, String featherColor) {
        this(birdName, wingSpan, featherColor, "Herbivore");
        System.out.println("Three Argument Constructor");
    }

  
    Bird(String birdName, int wingSpan, String featherColor, String foodType) {
        this(birdName, wingSpan, featherColor, foodType, "Forest");
        System.out.println("Four Argument Constructor");
    }

  
    Bird(String birdName, int wingSpan, String featherColor, String foodType, String habitatPlace) {

        this.birdName = birdName;
        this.wingSpan = wingSpan;
        this.featherColor = featherColor;
        this.foodType = foodType;
        this.habitatPlace = habitatPlace;

        System.out.println("Bird Name      : " + birdName);
        System.out.println("Wing Span      : " + wingSpan);
        System.out.println("Feather Color  : " + featherColor);
        System.out.println("Food Type      : " + foodType);
        System.out.println("Habitat Place  : " + habitatPlace);
    }
}