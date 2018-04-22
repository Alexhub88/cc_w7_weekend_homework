import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
       guitar = new Guitar("Wood", "Sandalwood","Strings", 5, 23.5, 78.9);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Sandalwood", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Strings", guitar.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(23.5, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(78.9, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Strum, strum", guitar.play());
    }

    @Test
    public void hasStrings(){
        assertEquals(5, guitar.getNumStrings());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(55.4, guitar.calculateMarkUp(), 0.01);
    }
}
