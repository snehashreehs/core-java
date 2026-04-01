class WhatsAppRunner {

    public static void main(String[] args) {

        WhatsApp w1 = new WhatsApp("john_chat", "john@wa.com", 200, 2134535780L, true);
        w1.displayInfo();

        WhatsApp w2 = new WhatsApp("Alice_chat", "Alice@wa.com", 500, 8896689212L, false);
        w2.displayInfo();

        WhatsApp w3 = new WhatsApp("smith_chat", "smith@wa.com", 400, 6467794323L, true);
        w3.displayInfo();

        WhatsApp w4 = new WhatsApp("aspen_chat", "aspen@wa.com", 2000, 6311007865L, false);
        w4.displayInfo();

        WhatsApp w5 = new WhatsApp("hazel_chat", "hazel@wa.com", 900, 3424500005L, true);
        w5.displayInfo();

        WhatsApp w6 = new WhatsApp("ravi_chat", "ravi@wa.com", 435 ,6547000006L, false);
        w6.displayInfo();

        WhatsApp w7 = new WhatsApp("gale_chat", "gale@wa.com", 100, 8110000007L, true);
        w7.displayInfo();
    }
}