class NetflixRunner {
    public static void main(String[] args) {

        Netflix obj1 = new Netflix("Stranger Things", "Sci-Fi", 8500);
        obj1.display();

        Netflix obj2 = new Netflix("Money Heist", "Crime", 9200);
        obj2.display();

        Netflix obj3 = new Netflix("Wednesday", "Comedy Horror", 7800);
        obj3.display();

        Netflix obj4 = new Netflix("The Witcher", "Fantasy", 6900);
        obj4.display();

        Netflix obj5 = new Netflix("Squid Game", "Thriller", 11000);
        obj5.display();

        Netflix obj6 = new Netflix("Dark", "Mystery", 7300);
        obj6.display();

        Netflix obj7 = new Netflix("Lucifer", "Drama", 8800);
        obj7.display();
    }
}