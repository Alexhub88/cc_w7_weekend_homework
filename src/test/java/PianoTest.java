import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Ivory", "Black", "Keyboard", 45, 12.3, 67.8);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Ivory", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Keyboard", piano.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(12.3, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(67.8, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Plink, plink", piano.play());
    }

    @Test
    public void hasKeys(){
        assertEquals(45, piano.getKeys(), 0.01);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(55.5, piano.calculateMarkUp(), 0.01);
    }
}
