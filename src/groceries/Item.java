package groceries;

public class Item {
    private String name;
    private int quantity;
    private float price;

    // Empty constructor
    public Item(){}

    public Item(String name, int quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }
}
