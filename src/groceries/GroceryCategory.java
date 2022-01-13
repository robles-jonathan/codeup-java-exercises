package groceries;

import java.util.ArrayList;


public class GroceryCategory {
    private String categoryName;
    private ArrayList<Item> items;

    //Empty Constructor
    public GroceryCategory(){}

    public GroceryCategory(String categoryName){
        this.categoryName = categoryName;
        this.items = new ArrayList<Item>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "" + items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public static void main(String[] args) {

        //Beverages – coffee/tea, juice, soda
        //Bread – sandwich loaves, dinner rolls, tortillas, bagels
        //Canned Goods – vegetables, spaghetti sauce, ketchup
        //Dairy – cheeses, eggs, milk, yogurt, butter
        //DryGoods – cereals, flour, sugar, pasta, mixes
        //Frozen Foods – waffles, vegetables, individual meals, ice cream
        //Meat – lunch meat, poultry, beef, pork
        //Produce – fruits, vegetables
//        for(String i : groceryCategories.keySet()){
//            System.out.println("Key: " + i + "\nValue: " + groceryCategories.get(i));
//        }
    }
}
