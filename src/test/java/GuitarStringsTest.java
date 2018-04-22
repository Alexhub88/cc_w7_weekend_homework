import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    private GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings =  new GuitarStrings("Strings for playing guitar", 60,80);
    }


    @Test
    public void hasDescription(){
        assertEquals("Strings for playing guitar", guitarStrings.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(60, guitarStrings.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(80, guitarStrings.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(20, guitarStrings.calculateMarkUp(), 0.01);
    }
}
