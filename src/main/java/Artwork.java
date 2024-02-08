public class Artwork {

    private String title;
    private String artist;
    private double price;

    public Artwork(String title, String artist, double price){
        this.title = title;
        this.price = price;
        this.artist = artist;
    }
    
    public String getTitle(){
        return this.title;
    }

    public String getArtist(){
        return this.artist;
    }

    public double getPrice(){
        return this.price;
    }

    
}
