import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    List<Item> shoppingItems = new ArrayList();
    SalesTax tax = new SalesTax();
    BigDecimal subTotal = new BigDecimal(0);
    BigDecimal salesTax = new BigDecimal(0);
    BigDecimal total = new BigDecimal(0);
          
    public List<Item> getShoppingItems() {
        return shoppingItems;
    }
    
    public void addShoppingItem(Item item) {
        shoppingItems.add(item);
        calculateSubTotal(item);
        calculateSalesTax(item);
        calculateTotal();
    }
    
    public BigDecimal getSubTotal(){
        return subTotal;
    }
    
    public BigDecimal getSalesTax(){
        return salesTax;
    }
    
    public BigDecimal getTotal(){
        return total;
    }
    
    private void calculateSubTotal(Item item) {
        subTotal = subTotal.add(item.getQtn().multiply(item.getPrice()));
    }
    
    private void calculateSalesTax(Item item) {
        salesTax = salesTax.add(tax.get(item));
    }
    
    private void calculateTotal() {
        total = subTotal.add(salesTax);
    }
    
}
