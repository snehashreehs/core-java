class Hospital {

    public static void main(String[] args) {

        String hospitalName;
        String location;
        int totalBeds;
        double consultationFee;
        boolean isEmergencyAvailable;

        hospitalName = "City Care";
        location = "Bangalore";
        totalBeds = 150;
        consultationFee = 500.0;
        isEmergencyAvailable = true;
		
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
        System.out.println("Total Beds: " + totalBeds);
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Emergency Available: " + isEmergencyAvailable);

        hospitalName = "Global Health";
        location = "Chennai";
        totalBeds = 300;
        consultationFee = 750.0;
        isEmergencyAvailable = false;
	
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
        System.out.println("Total Beds: " + totalBeds);
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Emergency Available: " + isEmergencyAvailable);
    }
}