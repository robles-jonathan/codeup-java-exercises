package groceries;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GroceryListApplication {
    public static void main(String[] args) {
        HashMap<String, GroceryCategory> groceryCategories = new HashMap<>();
        HashMap<String, Item> items = new HashMap<>();
        GroceryCategory dairy = new GroceryCategory("Dairy");
        GroceryCategory beverages = new GroceryCategory("Beverages");
        GroceryCategory bread = new GroceryCategory("Bread");
        GroceryCategory cannedGoods = new GroceryCategory("Canned Goods");
        GroceryCategory dryGoods = new GroceryCategory("Dry Goods");
        GroceryCategory frozenFoods = new GroceryCategory("Frozen Foods");
        GroceryCategory meat = new GroceryCategory("Meat");
        GroceryCategory produce = new GroceryCategory("Produce");
        groceryCategories.put("Dairy", dairy);
        groceryCategories.put("Beverages", beverages);
        groceryCategories.put("Bread", bread);
        groceryCategories.put("Canned Goods", cannedGoods);
        groceryCategories.put("Dry Goods", dryGoods);
        groceryCategories.put("Frozen Foods", frozenFoods);
        groceryCategories.put("Meat", meat);
        groceryCategories.put("Produce", produce);
        Scanner sc = new Scanner(System.in);
        boolean response;
        boolean newResponse;
        boolean goOn;
        String category;
        String userItem;
        int quantity;
        System.out.println("Would you like to create a grocery list?");
        Input test = new Input(sc);
        response = test.yesNo();
        if(response){
            System.out.println("Would you like to enter a new item?");
            newResponse = test.yesNo();
            if(newResponse){
                do{
                    System.out.println("Which category would  you like to add a new item to?");
                    System.out.print("Categories: ");
                    for(String i : groceryCategories.keySet()){
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    category = sc.nextLine();
                    System.out.println("\nEnter the name of the item: ");
                    userItem = sc.nextLine();
                    System.out.println("Enter the quantity:");
                    quantity = sc.nextInt();
                    GroceryCategory newUserCategory = new GroceryCategory(category);
                    Item newUserItem = new Item(userItem,quantity);
                    items.put(userItem,newUserItem);
                    groceryCategories.put(category,newUserCategory);
                    for(String i : groceryCategories.keySet()){
                        System.out.println("Key: " + i + "\nValue: " + groceryCategories.get(i));
                    }
                    System.out.println("Would you like to add more items to your list?");
                    goOn = test.yesNo();
                }while(goOn);
            }
        }
    }
}
