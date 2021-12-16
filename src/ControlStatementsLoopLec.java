import java.util.Scanner;

public class ControlStatementsLoopLec {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        boolean hasPizzaRolls = true;
//        boolean hasPepsiWildCherry = false;
//
//        System.out.printf("Is David prepared for a night with out Juli: %b%n", hasPizzaRolls && hasPepsiWildCherry);
//        System.out.printf("Does David have something to guide him through the dark times: %b%n",hasPizzaRolls || hasPepsiWildCherry);
//
//        System.out.printf("Will David go hungry: %b%n",!hasPizzaRolls);
//        System.out.printf("Will David go thirsty: %b%n", !hasPepsiWildCherry);
//
//        System.out.println(sc.nextBoolean() || sc.nextBoolean());
//        System.out.println(sc.nextBoolean() && sc.nextBoolean());
//        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//
//        System.out.println("Did you bring enough gum for the entire class? How many sticks of gum do you have?");
//        int sticksOfGum = sc.nextInt();
//        System.out.printf("Enough gum for the class: %b%n", sticksOfGum >=23);

        System.out.println("Who was the 1994 and 1995 NBA Finals MVP?" );
        String number34 = sc.nextLine();
        System.out.printf("User from Houston && Likes Basketball: %b%n",number34.equalsIgnoreCase("Hakeem Olajuwon"));


    }
}
