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

   public void setWallet(double amount){
       this.wallet = amount;
   }

   

}
