import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private DrumSticks drumsticks;

    @Before
    public void before(){
        drumsticks =  new DrumSticks("Sticks for banging drums", 45,75);
    }

    @Test
    public void hasDescription(){
        assertEquals("Sticks for banging drums", drumsticks.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(45, drumsticks.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(75, drumsticks.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(30, drumsticks.calculateMarkUp(), 0.01);
    }
}
