class LibrarySystem {

    String libraryName;
    int totalBooks;
    String categoryType;
    String membershipLevel;
    String locationArea;

    
    LibrarySystem() {
        this("City Library", 5000);
        System.out.println("Default Constructor");
    }

    
    LibrarySystem(String libraryName, int totalBooks) {
        this(libraryName, totalBooks, "General");
        System.out.println("Two Argument Constructor");
    }

  
    LibrarySystem(String libraryName, int totalBooks, String categoryType) {
        this(libraryName, totalBooks, categoryType, "Standard");
        System.out.println("Three Argument Constructor");
    }

    
    LibrarySystem(String libraryName, int totalBooks, String categoryType, String membershipLevel) {
        this(libraryName, totalBooks, categoryType, membershipLevel, "Downtown");
        System.out.println("Four Argument Constructor");
    }

  
    LibrarySystem(String libraryName, int totalBooks, String categoryType,
                  String membershipLevel, String locationArea) {

        this.libraryName = libraryName;
        this.totalBooks = totalBooks;
        this.categoryType = categoryType;
        this.membershipLevel = membershipLevel;
        this.locationArea = locationArea;

        System.out.println("Library Name     : " + libraryName);
        System.out.println("Total Books      : " + totalBooks);
        System.out.println("Category Type    : " + categoryType);
        System.out.println("Membership Level : " + membershipLevel);
        System.out.println("Location Area    : " + locationArea);
    }
}