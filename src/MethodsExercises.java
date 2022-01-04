import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }
    public static int remainder( int num1, int num2){
        return num1 % num2;
    }
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int input = scanner.nextInt();
        if (input >= min && input <= max) {
            System.out.println("Thank you for following directions!");
            return input;
        } else {
            System.out.println("Invalid Entry");
            return getInteger(min, max);
        }
    }

    public static long getFactorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int input = scanner.nextInt();
        if (input >= 1 && input <= 10) {
            if(input == 1){
                return 1;
            }
            for(var i = input -1; i > 1; i--) {
                input = input * i;
            }
            return input;
        } else {
            System.out.println("Invalid Entry");
            return getInteger(1, 10);
        }
    }

    public static void diceRoll(){
        Boolean goOn = true;
        Scanner scanner = new Scanner(System.in);
        Random randomNum = new Random();


        while(goOn){
            System.out.print("\nEnter the number of dice: ");
            int numberOfDice = scanner.nextInt();
            System.out.println("Enter \"Roll\" to roll the dice.");
            String response = scanner.next();
            if (response.equalsIgnoreCase("Roll")) {
                int randomNumber = 0;
                for(var i = 0; i < numberOfDice; i++){
                    randomNumber = randomNum.nextInt(6)+1;
                    System.out.print(randomNumber + " ");
                }
                System.out.println("\nWanna play again? true/false");
                goOn = scanner.nextBoolean();
            }
        }

    }

    /*TODO: Bonus
     *Create your multiplication method without the * operator (Hint: a loop might be helpful).
     * https://medium.com/@ctrlalt_diljeet/multiply-without-using-in-javascript-890857bb003c
     *Do the above with recursion.
     * https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
     */

    public static void main(String[] args) {
//        System.out.println(addition(4, 5));
//        System.out.println(subtraction(3, 4));
//        System.out.println(multiplication(3, 4));
//        System.out.println(division(40, 5));
//        System.out.println(division(35, 5));
//        System.out.println(remainder(388, 5));

//        System.out.println(getFactorial());

        diceRoll();
//Food for thought: What happens if we try to divide by zero? What should happen?
    }

}
