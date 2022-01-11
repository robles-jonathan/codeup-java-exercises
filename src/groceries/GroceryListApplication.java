package groceries;

import util.Input;

import java.util.Scanner;

public class GroceryListApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean response;
        boolean newResponse;
        boolean goOn;
        System.out.println("Would you like to create a grocery list?");
        Input test = new Input(sc);
        response = test.yesNo();
        if(response){
            System.out.println("Would you like to enter a new item?");
            newResponse = test.yesNo();
            if(newResponse){
                do{
                    System.out.println("Which category would  you like to add a new item to?");
                    System.out.println("Enter the name of the item: ");
                    System.out.println("Enter the quantity:");
                    System.out.println("Would you like to add more items to your list?");
                    goOn = test.yesNo();
                }while(goOn);
            }
        }
    }
}
