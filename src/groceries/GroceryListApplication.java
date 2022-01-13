package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApplication {

    public static void addToList(HashMap<String, ArrayList<Item>> list, Input in){
        System.out.println("Which category would you like to add a new item to?");
        int num = 1;
        for(String category : list.keySet()){
            System.out.printf("%d: %s%n", num, category);
            num++;
        }
        String selectedCategory = "";
        while(!list.containsKey(selectedCategory)) {
            selectedCategory = in.getString("Please enter the name of the item's category: ");
            if (!list.containsKey(selectedCategory)) {
                System.out.println("Invalid category\nPlease try again.");
            }
        }
        String itemName = in.getString("Please enter the name of the item: ");
        int itemQuantity = in.getInt("Please enter item quantity: ");
        float itemPrice = (float) in.getDouble("Please enter item price: ");
        in.getString();
        System.out.printf("Please review the following item:%nItem Name: %s%nItem Category: %s%nItem Quantity: %s%nItem Price: $%.2f%nWould you like to add this item to your grocery list?%n", itemName, selectedCategory, itemQuantity, itemPrice);
        if(in.yesNo()){
            System.out.println("Item has been saved to list.");
            list.get(selectedCategory).add(new Item(itemName, itemQuantity, itemPrice));
            System.out.println("Would you like to add a new item?");
            if(in.yesNo()){
                addToList(list, in);
            }
        } else {
            System.out.println("Item discarded.\nWould you like to add a new item?");
            if(in.yesNo()){
                addToList(list, in);
            }
        }
    }

    public static void printList(HashMap<String, ArrayList<Item>> list) {
        System.out.println("Current list of items: ");

    }

    public static void runApplication(HashMap<String, ArrayList<Item>> list, Input in){
        System.out.println("Would you like to create a grocery list?");
        Input test = new Input();
        boolean response = test.yesNo();
        if(response){
            System.out.println("Would you like to enter a new item?");
            boolean newResponse = test.yesNo();
            if(newResponse){

                addToList(list, in);
//                do{
//                    System.out.println("Which category would  you like to add a new item to?");
//                    System.out.print("Categories: ");
//                    for(String i : groceryCategories.keySet()){
//                        System.out.print(i + " ");
//                    }
//                    System.out.println();
//                    category = sc.nextLine();
//                    System.out.println("\nEnter the name of the item: ");
//                    userItem = sc.nextLine();
//                    System.out.println("Enter the quantity:");
//                    quantity = sc.nextInt();
//                    GroceryCategory newUserCategory = new GroceryCategory(category);
//                    Item newUserItem = new Item(userItem,quantity);
//                    items.put(userItem,newUserItem);
//                    groceryCategories.put(category,newUserCategory);
//                    for(String i : groceryCategories.keySet()){
//                        System.out.println("Key: " + i + "\nValue: " + groceryCategories.get(i));
//                    }
//                    System.out.println("Would you like to add more items to your list?");
//                    goOn = test.yesNo();
//                }while(goOn);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<Item>> list = new HashMap<>();
        list.put("Dairy", new ArrayList<>());
        list.put("Beverages", new ArrayList<>());
        list.put("Bread", new ArrayList<>());
        list.put("Canned Goods", new ArrayList<>());
        list.put("Dry Goods", new ArrayList<>());
        list.put("Frozen Foods", new ArrayList<>());
        list.put("Meat", new ArrayList<>());
        list.put("Produce", new ArrayList<>());

        runApplication(list, new Input());

    }
}
