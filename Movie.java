class Movie {

    String filmTitle;
    int durationMinutes;
    String genreType;
    String languageUsed;
    String releaseRegion;

    
    Movie() {
        this("Inception", 148);
        System.out.println("Default Constructor");
    }

    
    Movie(String filmTitle, int durationMinutes) {
        this(filmTitle, durationMinutes, "Sci-Fi");
        System.out.println("Two Argument Constructor");
    }

    
    Movie(String filmTitle, int durationMinutes, String genreType) {
        this(filmTitle, durationMinutes, genreType, "English");
        System.out.println("Three Argument Constructor");
    }

    
    Movie(String filmTitle, int durationMinutes, String genreType, String languageUsed) {
        this(filmTitle, durationMinutes, genreType, languageUsed, "Global");
        System.out.println("Four Argument Constructor");
    }

  
    Movie(String filmTitle, int durationMinutes, String genreType,
          String languageUsed, String releaseRegion) {

        this.filmTitle = filmTitle;
        this.durationMinutes = durationMinutes;
        this.genreType = genreType;
        this.languageUsed = languageUsed;
        this.releaseRegion = releaseRegion;

        System.out.println("Film Title      : " + filmTitle);
        System.out.println("Duration (min)  : " + durationMinutes);
        System.out.println("Genre           : " + genreType);
        System.out.println("Language        : " + languageUsed);
        System.out.println("Release Region  : " + releaseRegion);
    }
}