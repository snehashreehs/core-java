class YouTubeRunner {

    public static void main(String[] args) {

        YouTube y1 = new YouTube("tech_tube", "tech@yt.com", 15000, 9001111111L, true);
        y1.displayChannel();

        YouTube y2 = new YouTube("food_vlogs", "food@yt.com", 8200, 9002222222L, false);
        y2.displayChannel();

        YouTube y3 = new YouTube("travel_vibes", "travel@yt.com", 25000, 9003333333L, true);
        y3.displayChannel();

        YouTube y4 = new YouTube("gaming_zone", "game@yt.com", 18000, 9004444444L, true);
        y4.displayChannel();

        YouTube y5 = new YouTube("study_corner", "study@yt.com", 6000, 9005555555L, false);
        y5.displayChannel();

        YouTube y6 = new YouTube("fitness_pro", "fit@yt.com", 11000, 9006666666L, true);
        y6.displayChannel();

        YouTube y7 = new YouTube("music_world", "music@yt.com", 30000, 9007777777L, true);
        y7.displayChannel();
    }
}