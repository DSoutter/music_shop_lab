import inventory.accessories.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory drumSticks;

    @Before
    public void before(){
        drumSticks = new Accessory(10.0, 14.99, "Drum Sticks", "Used for the drums");
    }

    @Test
    public void drumSticksHavemarkup(){
        assertEquals(4.99, drumSticks.calculateMarkup(),0.01);
    }

    @Test
    public void drumSticksHaveName(){
        assertEquals("Drum Sticks", drumSticks.getItemName());
    }

    @Test
    public void drumSticksHaveDescription(){
        assertEquals("Used for the drums", drumSticks.getItemDescription());
    }
}

