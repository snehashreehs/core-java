class City {

    String cityName;
    int populationCount;
    String stateName;
    String famousFor;
    String countryName;

    
    City() {
        this("Bangalore", 12000000);
        System.out.println("Default Constructor");
    }

 
    City(String cityName, int populationCount) {
        this(cityName, populationCount, "Karnataka");
        System.out.println("Two Argument Constructor");
    }

 
    City(String cityName, int populationCount, String stateName) {
        this(cityName, populationCount, stateName, "IT Hub");
        System.out.println("Three Argument Constructor");
    }

  
    City(String cityName, int populationCount, String stateName, String famousFor) {
        this(cityName, populationCount, stateName, famousFor, "India");
        System.out.println("Four Argument Constructor");
    }

   
    City(String cityName, int populationCount, String stateName,
         String famousFor, String countryName) {

        this.cityName = cityName;
        this.populationCount = populationCount;
        this.stateName = stateName;
        this.famousFor = famousFor;
        this.countryName = countryName;

        System.out.println("City Name        : " + cityName);
        System.out.println("Population       : " + populationCount);
        System.out.println("State            : " + stateName);
        System.out.println("Famous For       : " + famousFor);
        System.out.println("Country          : " + countryName);
    }
}