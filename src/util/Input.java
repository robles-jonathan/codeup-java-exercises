package util;

import java.util.Scanner;

public class Input {
    private Scanner sc; // scanner variable

    public Input(Scanner sc){
        this.sc = sc;
    }


    public String getString(){
        return sc.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return sc.nextLine();
    }

    public boolean yesNo(){
        String userInput = getString();
        return userInput.equalsIgnoreCase("yes") ||
                userInput.equalsIgnoreCase("yea") ||
                userInput.equalsIgnoreCase("y") ||
                userInput.equalsIgnoreCase("yeah")||
                userInput.equalsIgnoreCase("yup") ||
                userInput.equalsIgnoreCase("mhm");
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %s-%s\n", min, max);
        int userInt = getInt();
        if(userInt <= max && userInt >= min){
            return userInt;
        }else{
            System.out.printf("You entered an invalid number. Must be between %s-%s\n", min, max);
            return getInt(min, max);
        }
    }

    public int getInt(){
        int userInt;
        try {
            userInt = Integer.valueOf(getString());
        } catch (NumberFormatException e){
            System.out.println("ERROR: Must enter a non-decimal number");
            return getInt();
        }
        return userInt;
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %s-%s\n", min, max);
        double userDouble = getDouble();
        if(userDouble <= max && userDouble >= min){
            return userDouble;
        }else{
            System.out.println("You entered an invalid number.");
        }
        return getDouble(min, max);
    }

    public double getDouble(){
        double userDouble;
        try{
            userDouble = Double.valueOf(getString());
        } catch (NumberFormatException e){
            System.out.println("ERROR: Must enter a decimal number");
            return getDouble();
        }
        return userDouble;
    }

    // getBinary
    public int getBinary() {
        int output;
        try {
            output = Integer.valueOf(getString(), 2);
        } catch (NumberFormatException e){
            System.out.println("ERROR: Invalid binary number. Try again.");
            return getBinary();
        }
        return output;
    }

    // getHex
    public int getHex(){
        int output;
        try {
            output = Integer.valueOf(getString(), 16);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid hexadecimal. Try again.");
            return getHex();
        }
        return output;
    }

    public static void main(String[] args) {
        Input input = new Input(new Scanner(System.in));
        System.out.println("Enter a number: ");
        int userInt = input.getHex();
        System.out.println(userInt);
    }
    /**TODO: Allow all of your methods for getting input to accept an optional String parameter named prompt. If passed, the method should show the given prompt to the user before parsing the input.**/
}
