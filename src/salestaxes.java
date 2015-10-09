import java.math.BigDecimal;

public class salestaxes {
    static BigDecimal appleCost = new BigDecimal("1.90");
    public static void main(String[] args) {
        appleCost.setScale(2, BigDecimal.ROUND_HALF_UP);
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        Item apple;
        apple = new Item("Apple", "Fruit", 1, appleCost); 
        
        shoppingBasket.addShoppingItem(apple);
        shoppingBasket.getShoppingItems();
        System.out.println(shoppingBasket.getShoppingItems());
        
        BigDecimal price = apple.getPrice();
        System.out.println(price.multiply(new BigDecimal(2)));
        
    }
    
}
