import inventory.ISell;
import inventory.Inventory;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private double netProfit;

    public Shop(ArrayList<ISell> stock, double netProfit) {
        this.stock = stock;
        this.netProfit = netProfit;
    }

    public int getInventoryArrayListSize() {
        return stock.size();
    }

    public double getNetProfit() {
        return netProfit;
    }

    public void buyItem(ISell item){
        stock.add(item);
    }


    public void sellItem(ISell item){
        if (stock.contains(item)){
            stock.remove(item);
            netProfit += item.calculateMarkup();
        }
    }
}
