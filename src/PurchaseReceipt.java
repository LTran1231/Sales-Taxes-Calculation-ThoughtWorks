import java.math.BigDecimal;

public class PurchaseReceipt {
    static BigDecimal appleCost = new BigDecimal("1.90");
    public static void main(String[] args) {
        System.out.println("CUSTOMER SHOPPING RECEIPT 1");
        ShoppingBasket shoppingBasket_1 = new ShoppingBasket();
        Item book = new Item("book", "book", "domestic", new BigDecimal("1"), new BigDecimal("12.49")); 
        Item music = new Item("music CD", "music", "domestic", new BigDecimal("1"), new BigDecimal("14.99"));
        Item chocolate_bar = new Item("chocolate bar", "food", "domestic", new BigDecimal("1"), new BigDecimal("0.85"));
                
        shoppingBasket_1.addShoppingItem(book);
        shoppingBasket_1.addShoppingItem(music);
        shoppingBasket_1.addShoppingItem(chocolate_bar);
        System.out.println("===============================================================================");
        System.out.println("Qtn"+ " Name" + "                               Price");
        System.out.println("===============================================================================");
        System.out.println(book.getQtn() + "   " + book.getName() + "                               $" + book.getPrice());
        System.out.println(music.getQtn() + "   " + music.getName() + "                           $" + music.getPrice());
        System.out.println(chocolate_bar.getQtn() + "   " + chocolate_bar.getName()+ "                      $" + chocolate_bar.getPrice());
        System.out.println("----------------------------------------------------");
        System.out.println("Subtotal: $" + shoppingBasket_1.getSubTotal());
        System.out.println("Sales taxes: $" + shoppingBasket_1.getSalesTax());
        System.out.println("Total: $" + shoppingBasket_1.getTotal());
        System.out.println("==================================END==========================================");

// ------------------------------------------------------------------------- 
        System.out.println();
        System.out.println("CUSTOMER SHOPPING RECEIPT 2");
        ShoppingBasket shoppingBasket_2 = new ShoppingBasket();
        
        Item box_of_chocolates = new Item("imported box of chocolates", "food", "imported", new BigDecimal("1"), new BigDecimal("10.00"));
        Item bottle_of_perfume = new Item("imported bottle of perfume", "perfume", "imported", new BigDecimal("1"), new BigDecimal("47.50"));
        
        shoppingBasket_2.addShoppingItem(box_of_chocolates);
        shoppingBasket_2.addShoppingItem(bottle_of_perfume);
        
        System.out.println("===============================================================================");
        System.out.println("Qtn" + "  Name" + "                              Price");
        System.out.println("===============================================================================");
        System.out.println(box_of_chocolates.getQtn() + "   " + box_of_chocolates.getName() + "         $" + box_of_chocolates.getPrice());
        System.out.println(bottle_of_perfume.getQtn() + "   " + bottle_of_perfume.getName() + "         $" + bottle_of_perfume.getPrice());
        System.out.println("----------------------------------------------------");
        System.out.println("Subtotal: $" + shoppingBasket_2.getSubTotal());
        System.out.println("Sales taxes: $" + shoppingBasket_2.getSalesTax());
        System.out.println("Total: $" + shoppingBasket_2.getTotal());
        System.out.println("==================================END==========================================");
// --------------------------------------------------------------------------
        System.out.println();
        System.out.println("CUSTOMER SHOPPING RECEIPT 3");
        ShoppingBasket shoppingBasket_3 = new ShoppingBasket();
        
        Item bottle_of_perfume_1 = new Item("imported bottle of perfume", "perfume", "imported", new BigDecimal("1"), new BigDecimal("27.99"));
        Item bottle_of_perfume_2 = new Item("bottle of perfume", "perfume", "domestic", new BigDecimal("1"), new BigDecimal("18.99"));
        Item packet_of_headache_pills = new Item("packet of headache pills", "medical", "domestic", new BigDecimal("1"), new BigDecimal("9.75"));
        Item box_of_imported_chocolates = new Item("box of imported chocolates", "food", "imported", new BigDecimal("1"), new BigDecimal("11.25"));
           

        shoppingBasket_3.addShoppingItem(bottle_of_perfume_1);
        shoppingBasket_3.addShoppingItem(bottle_of_perfume_2);
        shoppingBasket_3.addShoppingItem(packet_of_headache_pills);
        shoppingBasket_3.addShoppingItem(box_of_imported_chocolates);
        
        System.out.println("===============================================================================");
        System.out.println("Qtn" + "  Name" + "                              Price");
        System.out.println("===============================================================================");
        System.out.println(bottle_of_perfume_1.getQtn() + "   " + bottle_of_perfume_1.getName() + "         $" + bottle_of_perfume_1.getPrice());
        System.out.println(bottle_of_perfume_2.getQtn() + "   " + bottle_of_perfume_2.getName() + "                  $" + bottle_of_perfume_2.getPrice());
        System.out.println(packet_of_headache_pills.getQtn() + "   " + packet_of_headache_pills.getName() + "           $" + packet_of_headache_pills.getPrice());
        System.out.println(box_of_imported_chocolates.getQtn() + "   " + box_of_imported_chocolates.getName() + "         $" + box_of_imported_chocolates.getPrice());
        System.out.println("----------------------------------------------------");
        System.out.println("Subtotal: $" + shoppingBasket_3.getSubTotal());
        System.out.println("Sales taxes: $" + shoppingBasket_3.getSalesTax());
        System.out.println("Total: $" + shoppingBasket_3.getTotal());
        System.out.println("==================================END==========================================");

        
    }
    
}