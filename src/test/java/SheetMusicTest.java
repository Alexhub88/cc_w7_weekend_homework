import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic  =  new SheetMusic ("Instructions for playing music", 45,75);
    }

    @Test
    public void hasDescription(){
        assertEquals("Instructions for playing music",sheetMusic.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(45, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(75, sheetMusic.getSellPrice(), 0.01);
    }
    @Test
    public void canCalculateMarkUp() {
        assertEquals(30, sheetMusic.calculateMarkUp(), 0.01);
    }
}
