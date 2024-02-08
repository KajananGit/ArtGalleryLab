import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> artCollection;

   public Customer(String name, double wallet){
       this.name = name;
       this.wallet = wallet;
       this.artCollection = new ArrayList<>();
   }

   public double getWallet(){
       return this.wallet;
   }

    public ArrayList<Artwork> getArtCollection() {
        return artCollection;
    }

    public void buyArtwork(Gallery gallery, Artwork art){
       Artwork wantedArt = gallery.getArtwork(art);
       double cost = wantedArt.getPrice();
       if(cost < wallet){
           wallet -= cost;
           gallery.addTill(cost);
           gallery.removeArtWork(art);
           artCollection.add(art);
       }
   }







}
