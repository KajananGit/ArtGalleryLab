import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public double getTill() {
        return this.till;
    }

    public void addTill(double amount){
        this.till += amount;
    }



    public void addArtwork(Artwork art) {
        this.stock.add(art);
    }

    public void removeArtWork(Artwork art) {
        this.stock.remove(art);
    }

    public ArrayList<Artwork> getStock() {
        return this.stock;
    }

    public Artwork getArtwork(Artwork art){
        if(stock.contains(art)){
            return art;
        }
        else {
            return null;
        }
    }

    public double stock_take(){
        double totalValue = 0;
        for(Artwork art : stock){
            totalValue += art.getPrice();
        }
        return totalValue;
    }


}