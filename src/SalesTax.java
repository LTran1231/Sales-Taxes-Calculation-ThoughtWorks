import java.math.BigDecimal;

public class SalesTax {
    
    private static final BigDecimal ROUNDING_SCALE = new BigDecimal("0.05");
    private static final BigDecimal IMPORTED_GOODS = new BigDecimal("5");
    private static final BigDecimal DOMESTIC_GOODS = new BigDecimal("10");
    private static BigDecimal itemTaxPercentage = null;
    
 
    public BigDecimal get(Item item){
        calculateTaxPercentage(item);
        BigDecimal tax = calculateSalesTax(item);
        return tax;
    }
    
    private BigDecimal calculateSalesTax(Item item){
        BigDecimal salesTax = item.getQtn().multiply(item.getPrice()).multiply(itemTaxPercentage).divide(new BigDecimal("100"));
        return salesTax.divide(ROUNDING_SCALE).setScale(0, BigDecimal.ROUND_UP).multiply(ROUNDING_SCALE);

    }
    
    private void calculateTaxPercentage(Item item){
        String type = item.getType();
        String category = item.getCategory();
        
        if (category.equals("book") || category.equals("food") || category.equals("medical")) {
            itemTaxPercentage = new BigDecimal("0.00");
        } else {
            itemTaxPercentage = DOMESTIC_GOODS;
        }
        if (type.equals("imported")) {
            itemTaxPercentage = itemTaxPercentage.add(IMPORTED_GOODS);
        }
    }
}
