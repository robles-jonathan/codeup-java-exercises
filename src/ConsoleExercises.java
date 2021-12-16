import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args){
        /**Copy this code into your main method:
         *      double pi = 3.14159;
         *  Write some Java code that uses the variable pi to output the following:
         *      The value of pi is approximately 3.14.
         *  Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
         */
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.%n", pi);
        /**
         * Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
         *
         * What happens if you input something that is not an integer?
         * */
//        System.out.println("What is your favorite number?");
//        Scanner scanner = new Scanner(System.in);
//        int userFavNum = scanner.nextInt();
//        System.out.printf("Your favorite number is : %d.",userFavNum);

        /**
         * Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
         *
         * What happens if you enter less than 3 words? The program expects three words so it does not allow you to exit till 3 words have been provided.
         *
         * What happens if you enter more than 3 words? The program only stores the first three words*/
//        System.out.println("Enter 3 words.");
//        Scanner scanner = new Scanner (System.in);
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("The first word you entered was: %s.\n" +
//                "The Second word you entered was: %s.\n" +
//                "The Third word you entered was: %s.",firstWord,secondWord,thirdWord);

        /**Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
         do you capture all the words? No the next method only returns the characters till it reaches whitespace example first word.*/
//        System.out.println("Enter a sentence:");
//        Scanner scanner = new Scanner(System.in);
//        String sentence = scanner.next();
//        System.out.printf("The Sentence you entered was: %s", sentence);

        /**Rewrite the above example using the nextLine method.*/
//        System.out.println("Enter a sentence:");
//        Scanner scanner = new Scanner(System.in);
//        String sentence = scanner.nextLine();
//        System.out.printf("The Sentence you entered was: %s", sentence);

        /**Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).*/
        System.out.println("What is the length, width, and height of your room in feet?");


        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        double length = scanner.nextInt();
        double width = scanner.nextInt();
        double height = scanner.nextInt();

//        System.out.println("What is the width of your room in feet?");
        double area = length * width;
        double perimeter = 2 * length + 2 * width;
        double volume = length * width * height;
        System.out.printf("The Area of your room is: %f sqft.\nThe Perimeter of your room is : %f ft.\nThe Volume of your room is: %f ft cubed.", area, perimeter, volume);
    }
}

