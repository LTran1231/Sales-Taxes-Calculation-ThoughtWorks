import java.math.BigDecimal;

public class Item {
    private String name;
    private String category;
    private String type;
    private BigDecimal qtn;
    private BigDecimal price;
    
    public Item(String name, String category, String type, BigDecimal qtn, BigDecimal price) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.qtn = qtn;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getCategory(){
        return category;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public BigDecimal getQtn(){
        return qtn;
    }
    
    public void setQtn(BigDecimal quantity){
        this.qtn = quantity;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
