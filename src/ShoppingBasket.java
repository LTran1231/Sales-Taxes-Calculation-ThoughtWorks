import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<Item> shoppingItems = new ArrayList();
    
    public void addShoppingItem(Item basketItem) {
        shoppingItems.add(basketItem);
    }
    
    public List<Item> getShoppingItems() {
        return shoppingItems; 
    }
}
