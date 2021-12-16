import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //GRADING SYSTEM
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Enter a grade number: ");
            int grade = scanner.nextInt();
            if (grade >= 88 && grade <= 100) {
                System.out.println("You got an A");
            } else if (grade >= 80 && grade < 88) {
                System.out.println("You got a B");
            } else if (grade >= 67 && grade < 80) {
                System.out.println("You got a C");
            } else if (grade >= 60 && grade < 67) {
                System.out.println("You got a D");
            } else if (grade >= 0 && grade < 60) {
                System.out.println("You got an F");
            } else {
                System.out.println("You did not enter a grade value (0 - 100)");
            }
            System.out.println("Would you like to continue?");
            input = scanner.next();
        } while (input.equalsIgnoreCase("yes"));
        System.out.println("Have a nice day!");

    }

}
