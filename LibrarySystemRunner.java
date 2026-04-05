class LibrarySystemRunner {
    public static void main(String[] args) {

        LibrarySystem l1 = new LibrarySystem();

        System.out.println("------------------");

        LibrarySystem l2 = new LibrarySystem("National Library", 8000);

        System.out.println("------------------");

        LibrarySystem l3 = new LibrarySystem("University Library", 12000, "Academic");

        System.out.println("------------------");

        LibrarySystem l4 = new LibrarySystem("Community Library", 3000, "Public", "Premium");

        System.out.println("------------------");

        LibrarySystem l5 = new LibrarySystem("Digital Library", 20000, "E-Books", "VIP", "Online");
    }
}