
import java.math.BigDecimal;
import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;



public class PurchaseReceiptTest {
    ShoppingBasket shoppingBasket_1;
    ShoppingBasket shoppingBasket_2;
    


    @Before
    public void setUpShoppingBasket1() {
        shoppingBasket_1 = new ShoppingBasket();
    }
    
    @Test
    public void testShoppingBasket1IsEmpty(){
        assertThat(shoppingBasket_1.getShoppingItems(), is(IsNull.notNullValue()));
    }
    
    @Test
    public void testShoppingBasket1(){
        Item book = new Item("book", "book", "domestic", new BigDecimal("1"), new BigDecimal("12.49"));
        Item music = new Item("music CD", "music", "domestic", new BigDecimal("1"), new BigDecimal("14.99"));
        Item chocolate_bar = new Item("chocolate bar", "food", "domestic", new BigDecimal("1"), new BigDecimal("0.85"));

        shoppingBasket_1.addShoppingItem(book);
        assertThat(shoppingBasket_1.getTotal(), is(new BigDecimal("12.49")));
        shoppingBasket_1.addShoppingItem(music);
        assertThat(shoppingBasket_1.getTotal().subtract(new BigDecimal("12.49")), is(new BigDecimal("16.49")));
        shoppingBasket_1.addShoppingItem(chocolate_bar);
        assertThat(shoppingBasket_1.getTotal().subtract(new BigDecimal("12.49")).subtract(new BigDecimal("16.49")), is(new BigDecimal("0.85")));

        assertThat(shoppingBasket_1.getSalesTax(), is(new BigDecimal("1.50")));
        assertThat(shoppingBasket_1.getTotal(), is(new BigDecimal("29.83")));
    }
    
    @Before
    public void setUpShoppingBasket2() {
        shoppingBasket_2 = new ShoppingBasket();
    }

    @Test
    public void testShoppingCartIsEmpty() {
        assertThat(shoppingBasket_2.getShoppingItems(), is(IsNull.notNullValue()));
    }
    
    @Test
    public void testShoppingBasket_2(){
        Item box_of_chocolates = new Item("imported box of chocolates", "food", "imported", new BigDecimal("1"), new BigDecimal("10.00"));
        Item bottle_of_perfume = new Item("imported bottle of perfume", "perfume", "imported", new BigDecimal("1"), new BigDecimal("47.50"));

        shoppingBasket_2.addShoppingItem(box_of_chocolates);
        assertThat(shoppingBasket_2.getTotal(), is(new BigDecimal("10.50")));
        shoppingBasket_2.addShoppingItem(bottle_of_perfume);
        assertThat(shoppingBasket_2.getTotal().subtract(new BigDecimal("10.50")), is(new BigDecimal("54.65")));

        
        assertThat(shoppingBasket_2.getSalesTax(), is(new BigDecimal("7.65")));
        assertThat(shoppingBasket_2.getTotal(), is(new BigDecimal("65.15")));
    }
    

}
