class BoardRunner {


    public static void main(String[] args) {

        Board b1 = new Board();

        System.out.println("------------------");

        Board b2 = new Board("Blackboard", 6);

        System.out.println("------------------");

        Board b3 = new Board("Notice Board", 4, "Brown");

        System.out.println("------------------");

        Board b4 = new Board("Drawing Board", 7, "White", "Wood");

        System.out.println("------------------");

        Board b5 = new Board("Smart Board", 10, "Black", "Glass", "Digital Learning");
    }
}