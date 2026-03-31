class LaptopRunner {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.brand="HP"; l1.model="Pavilion"; l1.price=60000; l1.color="Silver"; l1.isAvailable=true; l1.ram=16; l1.rating=4.5;

        Laptop l2 = new Laptop();
        l2.brand="Dell"; l2.model="Inspiron"; l2.price=55000; l2.color="Black"; l2.isAvailable=true; l2.ram=8; l2.rating=4.2;

        Laptop l3 = new Laptop();
        l3.brand="Lenovo"; l3.model="ThinkPad"; l3.price=70000; l3.color="Grey"; l3.isAvailable=true; l3.ram=16; l3.rating=4.6;

        Laptop l4 = new Laptop();
        l4.brand="Asus"; l4.model="ROG"; l4.price=90000; l4.color="Black"; l4.isAvailable=false; l4.ram=32; l4.rating=4.8;

        Laptop l5 = new Laptop();
        l5.brand="Acer"; l5.model="Aspire"; l5.price=50000; l5.color="Blue"; l5.isAvailable=true; l5.ram=8; l5.rating=4.1;

        System.out.println("*****");
        System.out.println(l1.brand); System.out.println(l1.model); System.out.println(l1.price); System.out.println(l1.color); System.out.println(l1.isAvailable); System.out.println(l1.ram); System.out.println(l1.rating);

        System.out.println("*****");
        System.out.println(l2.brand); System.out.println(l2.model); System.out.println(l2.price); System.out.println(l2.color); System.out.println(l2.isAvailable); System.out.println(l2.ram); System.out.println(l2.rating);

        System.out.println("*****");
        System.out.println(l3.brand); System.out.println(l3.model); System.out.println(l3.price); System.out.println(l3.color); System.out.println(l3.isAvailable); System.out.println(l3.ram); System.out.println(l3.rating);

        System.out.println("*****");
        System.out.println(l4.brand); System.out.println(l4.model); System.out.println(l4.price); System.out.println(l4.color); System.out.println(l4.isAvailable); System.out.println(l4.ram); System.out.println(l4.rating);

        System.out.println("*****");
        System.out.println(l5.brand); System.out.println(l5.model); System.out.println(l5.price); System.out.println(l5.color); System.out.println(l5.isAvailable); System.out.println(l5.ram); System.out.println(l5.rating);
    }
}