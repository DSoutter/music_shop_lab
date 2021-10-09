package inventory.accessories;

import inventory.ISell;
import inventory.Inventory;

public class Accessory extends Inventory implements ISell {

    private final String itemName;
    private final String itemDescription;

    public Accessory(double wholesalePrice, double salePrice, String itemName, String itemDescription) {
        super(wholesalePrice, salePrice);
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }
}
