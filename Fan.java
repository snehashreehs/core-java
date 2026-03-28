class Fan {

    public static void main(String[] args){
	
        String brand;
        int speed;
        double price;
        boolean isOn;
        char energyRating;

        brand = "Usha";
        speed = 3;
        price = 2499.99;
        isOn = true;
        energyRating = 'A';

        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Price: " + price);
        System.out.println("Is On: " + isOn);
        System.out.println("Energy Rating:" + energyRating);
		
        brand = "Crompton";
        speed = 5;
        price = 3199.99;
        isOn = false;
        energyRating = 'B';

        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Price: " + price);
        System.out.println("Is On: " + isOn);
        System.out.println("Energy Rating: " + energyRating);
    }
}