class TwitterRunner {

    public static void main(String[] args) {

        Twitter t1 = new Twitter("tech_world", "tech@mail.com", 5400, 8000000001L, true);
        t1.show();

        Twitter t2 = new Twitter("daily_news", "news@mail.com", 3200, 8000000002L, false);
        t2.show();

        Twitter t3 = new Twitter("fun_memes", "memes@mail.com", 7800, 8000000003L, true);
        t3.show();

        Twitter t4 = new Twitter("sports_zone", "sports@mail.com", 2600, 8000000004L, false);
        t4.show();

        Twitter t5 = new Twitter("movie_updates", "movies@mail.com", 9100, 8000000005L, true);
        t5.show();

        Twitter t6 = new Twitter("food_blog", "food@mail.com", 1500, 8000000006L, false);
        t6.show();

        Twitter t7 = new Twitter("travel_diary", "travel@mail.com", 4300, 8000000007L, true);
        t7.show();
    }
}