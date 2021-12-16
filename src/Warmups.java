import java.util.Scanner;

public class Warmups {
    public static void main (String[] args){
        System.out.println("Java is statically typed, while Javascript is dynamically typed.");
        System.out.println("What did you eat for breakfast?");
        Scanner scanner = new Scanner(System.in);
        String userBreakfast = scanner.nextLine();
        System.out.printf("OH Wow!!, you had %s for breakfast. My favorite breakfast is %s!", userBreakfast, userBreakfast);
    }
}
