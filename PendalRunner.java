class PendalRunner {

    public static void main(String[] args) {

        Pendal p1 = new Pendal();

        p1.eventName = "Wedding";
        p1.location = "Bangalore";
        p1.decorationType = "Floral";
        p1.seatingCapacity = 500;
        p1.cost = 200000;
        p1.isBooked = true;
        p1.organizerName = "Ravi";

        Pendal p2 = new Pendal();

        p2.eventName = "Birthday";
        p2.location = "Chennai";
        p2.decorationType = "Theme";
        p2.seatingCapacity = 150;
        p2.cost = 50000;
        p2.isBooked = false;
        p2.organizerName = "Sowndu";

        Pendal p3 = new Pendal();

        p3.eventName = "Reception";
        p3.location = "Hyderabad";
        p3.decorationType = "Classic";
        p3.seatingCapacity = 300;
        p3.cost = 120000;
        p3.isBooked = true;
        p3.organizerName = "Vidhya";

        Pendal p4 = new Pendal();

        p4.eventName = "Festival";
        p4.location = "Mumbai";
        p4.decorationType = "Traditional";
        p4.seatingCapacity = 800;
        p4.cost = 300000;
        p4.isBooked = false;
        p4.organizerName = "John";

        System.out.println("***** Printing Pendal Details *****");

        System.out.println("p1 Event: " + p1.eventName);
        System.out.println("p1 Location: " + p1.location);
        System.out.println("p1 Decoration: " + p1.decorationType);
        System.out.println("p1 Capacity: " + p1.seatingCapacity);
        System.out.println("p1 Cost: " + p1.cost);
        System.out.println("p1 Booked: " + p1.isBooked);
        System.out.println("p1 Organizer: " + p1.organizerName);

        System.out.println("***** Printing Pendal Details *****");

        System.out.println("p2 Event: " + p2.eventName);
        System.out.println("p2 Location: " + p2.location);
        System.out.println("p2 Decoration: " + p2.decorationType);
        System.out.println("p2 Capacity: " + p2.seatingCapacity);
        System.out.println("p2 Cost: " + p2.cost);
        System.out.println("p2 Booked: " + p2.isBooked);
        System.out.println("p2 Organizer: " + p2.organizerName);

        System.out.println("***** Printing Pendal Details *****");

        System.out.println("p3 Event: " + p3.eventName);
        System.out.println("p3 Location: " + p3.location);
        System.out.println("p3 Decoration: " + p3.decorationType);
        System.out.println("p3 Capacity: " + p3.seatingCapacity);
        System.out.println("p3 Cost: " + p3.cost);
        System.out.println("p3 Booked: " + p3.isBooked);
        System.out.println("p3 Organizer: " + p3.organizerName);

        System.out.println("***** Printing Pendal Details *****");

        System.out.println("p4 Event: " + p4.eventName);
        System.out.println("p4 Location: " + p4.location);
        System.out.println("p4 Decoration: " + p4.decorationType);
        System.out.println("p4 Capacity: " + p4.seatingCapacity);
        System.out.println("p4 Cost: " + p4.cost);
        System.out.println("p4 Booked: " + p4.isBooked);
        System.out.println("p4 Organizer: " + p4.organizerName);
    }
}