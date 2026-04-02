class Netflix {

    String showTitle;
    String genre;
    int views;

    public Netflix() {
    }

    public Netflix(String showTitle, String genre, int views) {
        this.showTitle = showTitle;
        this.genre = genre;
        this.views = views;
    }

    public void display() {
        System.out.println(showTitle);
        System.out.println(genre);
        System.out.println(views);
        System.out.println("----------------------");
    }
}