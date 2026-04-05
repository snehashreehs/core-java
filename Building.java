class Building {

    String buildingName;
    int floorCount;
    String buildingType;
    String materialUsed;
    String cityLocation;

 
    Building() {
        this("Sky Tower", 20);
        System.out.println("Default Constructor");
    }

   
    Building(String buildingName, int floorCount) {
        this(buildingName, floorCount, "Residential");
        System.out.println("Two Argument Constructor");
    }

    
    Building(String buildingName, int floorCount, String buildingType) {
        this(buildingName, floorCount, buildingType, "Concrete");
        System.out.println("Three Argument Constructor");
    }

 
    Building(String buildingName, int floorCount, String buildingType, String materialUsed) {
        this(buildingName, floorCount, buildingType, materialUsed, "Metro City");
        System.out.println("Four Argument Constructor");
    }

    
    Building(String buildingName, int floorCount, String buildingType,
             String materialUsed, String cityLocation) {

        this.buildingName = buildingName;
        this.floorCount = floorCount;
        this.buildingType = buildingType;
        this.materialUsed = materialUsed;
        this.cityLocation = cityLocation;

        System.out.println("Building Name : " + buildingName);
        System.out.println("Floors        : " + floorCount);
        System.out.println("Type          : " + buildingType);
        System.out.println("Material      : " + materialUsed);
        System.out.println("Location      : " + cityLocation);
    }
}