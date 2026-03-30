class Delivery {

   public static void main(String[] args) {

   System.out.println("Delivery Service Started");
   addOrder();
   System.out.println("Number of packages from different areas");

   long bangalore = 200L;
   long mysore = 150L;
   boolean isFastService = true;

   addPackages(bangalore, mysore, isFastService);
		
   int charge = getDeliveryCharge();
   System.out.println(charge);
   System.out.println("************************");
    }
    static void addOrder() {
    System.out.println("Order received successfully");
    System.out.println("Fast and safe delivery");
    System.out.println("************************");
    }
    static void addPackages(long area1, long area2, boolean isFastService) {
		
    System.out.println("Total number of packages:");
    long total = area1 + area2;
    System.out.println(total);
    System.out.println("Fast Service: " + isFastService);
    System.out.println("************************");
    }
    static int getDeliveryCharge() {
    System.out.println("Delivery charge is:");
    int charge = 50;
    System.out.println("Charge calculated");
    return charge;
 }
}