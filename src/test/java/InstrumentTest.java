import inventory.instruments.Instrument;
import inventory.instruments.Piano;
import inventory.instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Piano(400.00, 560.00, Type.PIANO, "Wood and metal and others", 88);
    }

    @Test
    public void pianoHasMarkup(){
        assertEquals(160.0, instrument.calculateMarkup(), 0.001);
    }

    @Test
    public void pianoHasType(){
        assertEquals("Clang", instrument.playMusic());
    }
}
