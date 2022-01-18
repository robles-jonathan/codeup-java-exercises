package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApplication {
    public static void menu(HashMap<String, ArrayList<Item>> list, Input in){
        System.out.println("\nWhat would you like to do?" +
                "\n1. Would you like to add a new item?" +
                "\n2. View list?" +
                "\n3. Exit.");
        Input input = new Input();
        //uses util/input method
        int userInput = input.getInt("Enter a number between 1 and 3", 1, 3);
        switch (userInput) {
            case 1:
                addToList(list, in);
                break;
            case 2:
                printList(list, in);
                break;
            case 3:
                System.out.println("Thank you come again!");
                break;
            default:
                System.out.println("Not an Option");
        }
    }

    public static void addToList(HashMap<String, ArrayList<Item>> list, Input in) {
        System.out.println("Which category would you like to add a new item to?");
        int num = 1;
        for (String category : list.keySet()) {
            System.out.printf("%d: %s%n", num, category);
            num++;
        }
        String selectedCategory = "";
        while (!list.containsKey(selectedCategory)) {
            selectedCategory = in.getString("Please enter the name of the item's category: ");
            if (!list.containsKey(selectedCategory)) {
                System.out.println("Invalid category\nPlease try again.");
            }
        }
        String itemName = in.getString("Please enter the name of the item: ");
        int itemQuantity = in.getInt("Please enter item quantity: ");
        float itemPrice = (float) in.getDouble("Please enter item price: ");
//        in.getString();
        System.out.printf("Please review the following item:%nItem Name: %s%nItem Category: %s%nItem Quantity: %s%nItem Price: $%.2f%nWould you like to add this item to your grocery list?%n", itemName, selectedCategory, itemQuantity, itemPrice);
        if (in.yesNo()) {
            System.out.println("Item has been saved to list.");
            list.get(selectedCategory).add(new Item(itemName, itemQuantity, itemPrice));
            System.out.println("Would you like to add a new item?");
            if (in.yesNo()) {
                addToList(list, in);
            } else {
                System.out.println("Item discarded.");
                menu(list, in);
            }
        }else {
            addToList(list, in);
        }
    }

    public static void printList(HashMap<String, ArrayList<Item>> list, Input in) {
        System.out.println("Current list of items: ");
        int categoriesGathered = 0;
        for (HashMap.Entry<String, ArrayList<Item>> pair : list.entrySet()) {
            if (!pair.getValue().isEmpty()) {
                categoriesGathered++;
                System.out.printf("%s: \n", pair.getKey());
                for (Item item : pair.getValue()) {
                    if (item.getQuantity() > 1) {
                        System.out.printf(" %s, %d, $%.2f each, $%.2f  total%n", item.getName(), item.getQuantity(), item.getPrice(), (item.getQuantity() * item.getPrice()));
                    } else {
                        System.out.printf("%s, $%.2f%n", item.getName(), item.getPrice());
                    }
                }
                System.out.println();
            }
        }
        menu(list, in);
        if (categoriesGathered == 0) {
            System.out.println("\nList is currently empty. \nPlease add items to your grocer list.\n");
        }
    }

    public static void runApplication(HashMap<String, ArrayList<Item>> list, Input in) {
        System.out.println("Would you like to create a grocery list?");
        Input test = new Input();
        boolean response = test.yesNo();
        if (response) {
            System.out.println("Would you like to enter a new item?");
            boolean newResponse = test.yesNo();
            if (newResponse) {
                addToList(list, in);
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
