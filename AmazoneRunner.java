class AmazoneRunner {

    public static void main(String[] args) {

        Amazone a1 = new Amazone("raj_shop", "raj@amazon.com", 25, 7011111111L, true);
        a1.showDetails();

        Amazone a2 = new Amazone("arun_store", "anu@amazon.com", 12, 7022222222L, false);
        a2.showDetails();

        Amazone a3 = new Amazone("kirthana_buy", "kiran@amazon.com", 40, 7033333333L, true);
        a3.showDetails();

        Amazone a4 = new Amazone("mamatha_cart", "meena@amazon.com", 8, 7044444444L, false);
        a4.showDetails();

        Amazone a5 = new Amazone("viji_orders", "vijay@amazon.com", 60, 7055555555L, true);
        a5.showDetails();

        Amazone a6 = new Amazone("ragav_deals", "ravi@amazon.com", 18, 7066666666L, false);
        a6.showDetails();

        Amazone a7 = new Amazone("dipak_buy", "deepa@amazon.com", 33, 7077777777L, true);
        a7.showDetails();
    }
}