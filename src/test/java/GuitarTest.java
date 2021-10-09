import inventory.instruments.Guitar;
import inventory.instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(80.00, 100.00, Type.STRING, "Wood", 6);
    }

    @Test
    public void guitarHasStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void guitarMakesNoise(){
        assertEquals("Strum", guitar.playMusic());
    }

    @Test
    public void guitarHasWholesalePrice(){
        assertEquals(80.0, guitar.getWholesalePrice(), 0.01);
    }

    @Test
    public void guitarHasSalePrice(){
        assertEquals(100.00, guitar.getSalePrice(),0.01);
    }

    @Test
    public void guitarHasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void guitarHasMarkup(){
        assertEquals(20.0, guitar.calculateMarkup(),0.01);
    }
}
