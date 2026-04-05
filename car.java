class Car {

    String carName;
    int carSpeed;
    String carColor;
    String fuelType;
    String carBrand;

    
    Car() {
        this("Sedan", 120);
        System.out.println("Default Constructor");
    }

    
    Car(String carName, int carSpeed) {
        this(carName, carSpeed, "Red");
        System.out.println("Two Argument Constructor");
    }

    
    Car(String carName, int carSpeed, String carColor) {
        this(carName, carSpeed, carColor, "Petrol");
        System.out.println("Three Argument Constructor");
    }

    
    Car(String carName, int carSpeed, String carColor, String fuelType) {
        this(carName, carSpeed, carColor, fuelType, "Toyota");
        System.out.println("Four Argument Constructor");
    }

 
    Car(String carName, int carSpeed, String carColor, String fuelType, String carBrand) {
        this.carName = carName;
        this.carSpeed = carSpeed;
        this.carColor = carColor;
        this.fuelType = fuelType;
        this.carBrand = carBrand;

        System.out.println("Car Name   : " + carName);
        System.out.println("Speed      : " + carSpeed + " km/h");
        System.out.println("Color      : " + carColor);
        System.out.println("Fuel Type  : " + fuelType);
        System.out.println("Brand      : " + carBrand);
    }
}