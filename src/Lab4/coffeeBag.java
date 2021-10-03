package Lab4;

import java.text.DecimalFormat;

public class coffeeBag {
    private double bagWeight;
    private int numberOfBags;
    private final static double PRICE= 5.99;
    private final static double TAXRATE = 7.25;

    public coffeeBag(double bagWeight,int numberOfBags){
        this.bagWeight = bagWeight;
        this.numberOfBags = numberOfBags;
    }

    public double totalPrice(){
        return this.bagWeight * this.numberOfBags * PRICE;

    }

    public double totalPriceWithTax(){

        return totalPrice()+(totalPrice()*TAXRATE)/100;
    }
    DecimalFormat dec = new DecimalFormat("###.##");
    public String toString(){

        return "Number of bags sold: " + numberOfBags + "\nweight per bag: " + bagWeight +
                "\nPrice per pound: " + PRICE + "\nSales tax: " + TAXRATE + "% " +
                "\nTotal price with tax: " + dec.format(totalPriceWithTax());
    }
   public static void main(String [] args) {

        coffeeBag coff = new coffeeBag(5,32);
       System.out.println(coff);
   }

}
