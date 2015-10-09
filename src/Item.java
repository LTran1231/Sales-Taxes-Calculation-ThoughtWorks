import java.math.BigDecimal;

public class Item {
    private String name;
    private String type;
    private int qtn;
    private BigDecimal price;
    
    public Item(String name, String type, int qtn, BigDecimal price) {
        this.name = name;
        this.type = type;
        this.qtn = qtn;
        this.price = price;
    }
    
    public String getType() {
        return type;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
