import java.math.BigDecimal;

public class PurchaseReceipt {
    static BigDecimal appleCost = new BigDecimal("1.90");
    public static void main(String[] args) {
        System.out.println("Customer Shopping Receipt 1");
        ShoppingBasket shoppingBasket_1 = new ShoppingBasket();
        Item book = new Item("book", "book", "domestic", new BigDecimal("1"), new BigDecimal("12.49")); 
        Item music = new Item("music CD", "music", "domestic", new BigDecimal("1"), new BigDecimal("14.99"));
        Item chocolate_bar = new Item("chocolate bar", "food", "domestic", new BigDecimal("1"), new BigDecimal("0.85"));
                
        shoppingBasket_1.addShoppingItem(book);
        shoppingBasket_1.addShoppingItem(music);
        shoppingBasket_1.addShoppingItem(chocolate_bar);
        
        
        System.out.println("Subtotal: $" + shoppingBasket_1.getSubTotal());
        System.out.println("Sales tax: $" + shoppingBasket_1.getSalesTax());
        System.out.println("Total: $" + shoppingBasket_1.getTotal());
        System.out.println("------------------------------------------------------------------------------");
// ------------------------------------------------------------------------- 
        System.out.println("Customer Shopping Receipt 2");
        ShoppingBasket shoppingBasket_2 = new ShoppingBasket();
        
        Item box_of_chocolates = new Item("imported box of chocolates", "food", "imported", new BigDecimal("1"), new BigDecimal("10.00"));
        Item bottle_of_perfume = new Item("imported bottle of perfume", "perfume", "imported", new BigDecimal("1"), new BigDecimal("47.50"));
        
        shoppingBasket_2.addShoppingItem(box_of_chocolates);
        shoppingBasket_2.addShoppingItem(bottle_of_perfume);
        
        System.out.println("Subtotal: $" + shoppingBasket_2.getSubTotal());
        System.out.println("Sales tax: $" + shoppingBasket_2.getSalesTax());
        System.out.println("Total: $" + shoppingBasket_2.getTotal());
        System.out.println("------------------------------------------------------------------------------");
// --------------------------------------------------------------------------
        System.out.println("Customer Shopping Receipt 2");
        ShoppingBasket shoppingBasket_3 = new ShoppingBasket();
        
        Item bottle_of_perfume_1 = new Item("imported bottle of perfume", "perfume", "imported", new BigDecimal("1"), new BigDecimal("27.99"));
        Item bottle_of_perfume_2 = new Item("bottle of perfume", "perfume", "domestic", new BigDecimal("1"), new BigDecimal("18.99"));
        Item packet_of_headache_pills = new Item("packet of headache pills", "medical", "domestic", new BigDecimal("1"), new BigDecimal("9.75"));
        Item box_of_imported_chocolates = new Item("box of imported chocolates", "food", "imported", new BigDecimal("1"), new BigDecimal("11.25"));
           
        
        shoppingBasket_3.addShoppingItem(bottle_of_perfume_1);
        shoppingBasket_3.addShoppingItem(bottle_of_perfume_2);
        shoppingBasket_3.addShoppingItem(packet_of_headache_pills);
        shoppingBasket_3.addShoppingItem(box_of_imported_chocolates);

        System.out.println("Subtotal: $" + shoppingBasket_3.getSubTotal());
        System.out.println("Sales tax: $" + shoppingBasket_3.getSalesTax());
        System.out.println("Total: $" + shoppingBasket_3.getTotal());
        System.out.println("------------------------------------------------------------------------------");
  
    }
    
}