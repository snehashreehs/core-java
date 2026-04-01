class PintrestRunner {

    public static void main(String[] args) {

        Pintrest p1 = new Pintrest("raj_pins", "raj@pin.com", 50, 2334455567L, true);
        p1.displayPins();

        Pintrest p2 = new Pintrest("akash_pins", "akash@pin.com", 100, 3333355555L, false);
        p2.displayPins();

        Pintrest p3 = new Pintrest("tara_pins", "tara@pin.com", 300, 2222244444L, true);
        p3.displayPins();

        Pintrest p4 = new Pintrest("avni_pins", "avni@pin.com", 70, 96567934L, false);
        p4.displayPins();

        Pintrest p5 = new Pintrest("rishi_pins", "rishi@pin.com", 500, 2233445566L, true);
        p5.displayPins();

        Pintrest p6 = new Pintrest("mira_pins", "mira@pin.com", 890, 8876634556L, false);
        p6.displayPins();

        Pintrest p7 = new Pintrest("sneha_pins", "sneha@pin.com", 230, 4354564657L, true);
        p7.displayPins();
    }
}