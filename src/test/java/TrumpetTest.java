import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class TrumpetTest {

        private Trumpet trumpet;

        @Before
        public void before(){
            trumpet = new Trumpet("Brass", "Bronze", "Wind", 7, 23.4, 93.4);
        }

        @Test
        public void hasMaterial(){
            assertEquals("Brass", trumpet.getMaterial());
        }

        @Test
        public void hasColour(){
            assertEquals("Bronze", trumpet.getColour());
        }

        @Test
        public void hasType(){
            assertEquals("Wind", trumpet.getType());
        }

        @Test
        public void hasBuyPrice(){
            assertEquals(23.4, trumpet.getBuyPrice(), 0.01);
        }

        @Test
        public void hasSellPrice(){
            assertEquals(93.4, trumpet.getSellPrice(), 0.01);
        }

        @Test
        public void canPlay(){
            assertEquals("Wah wah wah!", trumpet.play());
        }

        @Test
        public void hasValves(){
            assertEquals(7, trumpet.getValves(), 0.01);
        }

        @Test
        public void canCalculateMarkUp() {
            assertEquals(70, trumpet.calculateMarkUp(), 0.01);
        }
    }

