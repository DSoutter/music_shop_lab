import inventory.instruments.Guitar;
import inventory.instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(80.00, 100.00, Type.GUITAR, "Wood", 6);
    }

    @Test
    public void guitarHasStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void guitarMakesNoise(){
        assertEquals("Strum", guitar.playMusic());
    }
}
