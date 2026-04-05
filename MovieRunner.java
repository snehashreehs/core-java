class MovieRunner {

    public static void main(String[] args) {

        Movie m1 = new Movie();

        System.out.println("------------------");

        Movie m2 = new Movie("Bahubali", 160);

        System.out.println("------------------");

        Movie m3 = new Movie("Titanic", 195, "Romance");

        System.out.println("------------------");

        Movie m4 = new Movie("KGF", 155, "Action", "Kannada");

        System.out.println("------------------");

        Movie m5 = new Movie("Avatar", 180, "Fantasy", "English", "USA");
    }
}