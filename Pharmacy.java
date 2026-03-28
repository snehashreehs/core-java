class Pharmacy {
    public static void main(String[] args) {

        String pharmacyName;
        String location;
        String pharmacistName;
        int totalMedicines;
        double dailyIncom;
		
        pharmacyName = "Health Care Pharmacy";
        location = "Bangalore";
        pharmacistName = "Dr. Ravi";
        totalMedicines = 250;
        dailyIncome = 15000.75;

        System.out.println("Pharmacy Name: " + pharmacyName);
        System.out.println("Location: " + location);
        System.out.println("Pharmacist Name: " + pharmacistName);
        System.out.println("Total Medicines: " + totalMedicines);
        System.out.println("Daily Income: " + dailyIncome);

        pharmacyName = "City Medicals";
        location = "Chennai";

        System.out.println("Pharmacy Name: " + pharmacyName);
        System.out.println("Location: " + location);
    }
}