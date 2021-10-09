import inventory.ISell;
import inventory.Inventory;
import inventory.accessories.Accessory;
import inventory.instruments.Guitar;
import inventory.instruments.Piano;
import inventory.instruments.Type;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<ISell> inventory;
    Accessory drumSticks;
    Piano piano;
    Guitar guitar;


    @Before
    public void before(){
        inventory = new ArrayList<>();
        drumSticks = new Accessory(10.0, 14.99, "Drum Sticks", "Used for the drums");
        guitar = new Guitar(80.00, 100.00, Type.STRING, "Wood", 6);
        piano = new Piano(400.00, 560.00, Type.PIANO, "Wood and metal and others", 88);

        inventory.add(drumSticks);
        inventory.add(guitar);
        inventory.add(guitar);
        inventory.add(piano);
        inventory.add(piano);

        shop = new Shop(inventory, 1000.00);
    }

    @Test
    public void inventoryHasSize5(){
        assertEquals(5, shop.getInventoryArrayListSize());
    }

    @Test
    public void shopHasTill(){
        assertEquals(1000.0, shop.getTill(),0.01);
    }
}
