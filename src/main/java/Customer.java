public class Customer {

    private String name;
    private double wallet;

   public Customer(String name, double wallet){
       this.name = name;
       this.wallet = wallet;
   }

   public double getWallet(){
       return this.wallet;
   }

   public void buyArtwork(Gallery gallery, Artwork art){
       Artwork wantedArt = gallery.getArtwork(art);
       double cost = wantedArt.getPrice();
       if(cost < wallet){
           wallet -= cost;
           gallery.addTill(cost);
           gallery.removeArtWork(art);
       }
   }







}
