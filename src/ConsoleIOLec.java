import java.util.Scanner;

public class ConsoleIOLec {
    public static void main (String[] args){
        System.out.println();
        String firstName = "Jonathan";
        String lastName = "Robles";
        double pi = 3.14159;
        int myFavoriteNumber = 13;
        System.out.printf("Hello my name is %s %s. %n\nThe value of pi is: %d.", firstName, lastName, myFavoriteNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat is your favorite color?");
        String userInput = scanner.nextLine();
        System.out.printf("Wow my favorite color is %s too!!", userInput);
    }



}
