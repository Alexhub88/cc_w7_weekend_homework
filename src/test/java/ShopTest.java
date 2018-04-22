import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private SheetMusic sheetMusic;
    private ArrayList<ISell> stock;
    private ArrayList<ISell> shoppingList;

    @Before
    public void before(){
        stock = new ArrayList<>();
        guitar = new Guitar("Wood", "beige","Strings", 5, 23.5, 78.9);
        sheetMusic  =  new SheetMusic ("Instructions for playing music", 45,75);
        shop = new Shop(stock);
    }

    @Test
    public void canAddStockItem(){
        shoppingList = new ArrayList<>();
        shoppingList.add(guitar);
        shoppingList.add(sheetMusic);

        shop.addStockItem(guitar);
        shop.addStockItem(sheetMusic);

        assertEquals(shoppingList, shop.getStock());
    }

    @Test
    public void canRemoveStockItem(){
        shoppingList = new ArrayList<>();
        shoppingList.add(guitar);
        shoppingList.add(sheetMusic);

        shop.addStockItem(guitar);
        shop.addStockItem(sheetMusic);
        assertEquals(shoppingList, shop.getStock());

        shop.removeStockItem(sheetMusic);
        shoppingList.remove(sheetMusic);

        assertEquals(shoppingList, shop.getStock());
    }
}
