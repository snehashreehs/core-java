class Spotify {

    String songTitle;
    String artistName;
    int streams;

    
    public Spotify() {
    }

    public Spotify(String songTitle, String artistName, int streams) {
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.streams = streams;
    }

 
    public void display() {
        System.out.println(songTitle);
        System.out.println(artistName);
        System.out.println(streams);
        System.out.println("----------------------");
    }
}