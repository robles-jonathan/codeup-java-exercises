import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String response;
        do{
            System.out.println("What number would you like to go up to?");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            System.out.println("Here is your table");
            System.out.println("NUMBER | SQUARE | CUBED ");
            System.out.println("-------|--------|-------");
            for (int i = 1; i <= num; i++) {
                int num1 = i;
                int num2 = (int) Math.pow(i, 2);
                int num3 = (int) Math.pow(i, 3);
                System.out.printf("%-6d | %-6d | %-6d%n", num1, num2, num3);
            }
            System.out.println("Would you like to continue?");
            response = sc.next();
        } while(response.equalsIgnoreCase("yes"));
    }

}
