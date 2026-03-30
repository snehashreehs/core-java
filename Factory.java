class Factory {

    public static void main(String[] args) {

        System.out.println("TEXTILE FACTORY");

        addDetails();

        System.out.println("Production details:");

        long productsManufactured = 20000L;
        long productsSold = 15000L;
        boolean isRunning = true;

        addProduction(productsManufactured, productsSold, isRunning);

        int workers = getWorkerCount();
        System.out.println(workers);

        System.out.println("************************");
    }

    static void addDetails() {
        System.out.println("It manufactures cotton clothes");
        System.out.println("It has modern machines");
        System.out.println("************************");
    }

    static void addProduction(long manufactured, long sold, boolean running) {
        System.out.println("Remaining products in stock:");
        long remaining = manufactured - sold;
        System.out.println(remaining);
        System.out.println("Factory Running: " + running);
        System.out.println("************************");
    }

    static int getWorkerCount() {
        System.out.println("Number of workers in factory:");
        int workerCount = 250;
        System.out.println("Worker count received");
        return workerCount;
    }
}