package dpdev.stock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stock {

    private String company;
    private double  currentPrice;
    private List<Double> listOfPrice = new ArrayList<>();

    public Stock(String company, double currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        listOfPrice.add(this.currentPrice);
    }

    public void updatePrice(double price){
        this.currentPrice = price;
        listOfPrice.add(this.currentPrice);
    }

    public String printInformation(){
        return this.toString();
    }

    public double getCurrentPrice(){
        return this.currentPrice;
    }

    public double getMinPrice(){
        return Collections.min(listOfPrice);
    }

    public double getMaxPrice(){
        return Collections.max(listOfPrice);
    }

    public List<Double> getListOfPrice() {
        return listOfPrice;
    }

    @Override
    public String toString() {
        return "Company = \"" + company + "\"" +
                ", Current Price = " + this.getCurrentPrice() +
                "$, Min Price = " + this.getMinPrice() +
                "$, Max Price = " + this.getMaxPrice() +
                "$.";
    }
}
