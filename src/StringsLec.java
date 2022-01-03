import java.util.Locale;
import java.util.Scanner;

public class StringsLec {
    public static void main(String[] args) {
//        char d = 'd';
//        System.out.println(d == 'd');
//
//        Scanner sc = new Scanner(System.in);
//        String favoriteSoda = "Root Beer";
//        System.out.println("Hey Jon, What is your favorite soda?");
//        String userSoda = sc.nextLine();
//        System.out.printf("Jon remembered his favorite soda, and type it's name properly! %b%n", favoriteSoda.equals(userSoda));
//        System.out.printf("Jon remembered his favorite soda!! %b", favoriteSoda.equalsIgnoreCase(userSoda));

        // Compare the start and end of a string
//        String david = "daviD".toLowerCase();
//        String dad = "Dad".toLowerCase();
//
//        char firstLetterOfDavid = david.charAt(0);
//        System.out.println("Does \"David\" and \"Dad\" start with the same letter? " + dad.startsWith("" + firstLetterOfDavid));
//        char lastLetterOfDavid = david.charAt(david.length() - 1);
//        System.out.println("Does \"David\" and \"Dad\" end with the same letter? " + dad.endsWith("" + lastLetterOfDavid));
//
//        // Changing casing in strings
//        String scream = "AHHHHHH!!!!!";
//        System.out.println(scream.toLowerCase());

        //String Manipulation
//        String barney = "Barney The Dinosaur";
//        System.out.printf("Location of \"The\" in string at index %d. %n", barney.indexOf("The"));
//
//        String dinosaur = barney.substring(11);
//        System.out.println(dinosaur);
//        String the = barney.substring(7, 10);
//        System.out.println(the);
//        System.out.println(barney.replace(dinosaur, "Purple Dinosaur"));


        // String Trimming
//        String fluffyString = "            I Love Marsh Mellows!           ";
//        System.out.println(fluffyString.trim());


        // lastIndexOf
        String band = "Queen";
        System.out.println(band.indexOf("e")); // gets first index of that character
        System.out.println(band.lastIndexOf("e"));
    }

}
