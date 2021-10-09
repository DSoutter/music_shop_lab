import inventory.ISell;
import inventory.Inventory;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private double till;

    public Shop(ArrayList<ISell> stock, double till) {
        this.stock = stock;
        this.till = till;
    }

    public int getInventoryArrayListSize() {
        return stock.size();
    }

    public double getTill() {
        return till;
    }

    public void buyItem(){

    }

    public void sellItem(ISell item, int index){

    }
}
