class Jio {

    String planName;
    int validityDays;
    int price;

	public Jio() {
	
    }

   	public Jio(String planName, int validityDays, int price) {
        this.planName = planName;
        this.validityDays = validityDays;
        this.price = price;
    }

    public void display() {
        System.out.println(planName);
        System.out.println(validityDays);
        System.out.println(price);
        System.out.println("----------------------");
    }
}