import inventory.ISell;
import inventory.Inventory;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> inventoryArrayList;

    public Shop(ArrayList<ISell> inventoryArrayList) {
        this.inventoryArrayList = inventoryArrayList;
    }

    public int getInventoryArrayListSize() {
        return inventoryArrayList.size();
    }

}
