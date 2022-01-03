import java.util.Scanner;
/** TODO: Bob is a lackadaisical teenager. In conversation, his responses are very limited.

 Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
 He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
 He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
 He answers 'Whatever.' to anything else.
 Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
 */
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String emptyInput = "";
        System.out.println("Hi my name is Bob! Let's have a conversation!! To end our conversation enter \"bye\"");

        do {
            input = sc.nextLine();
            String trimmed = input.trim();
            if (input.endsWith("?")){
                System.out.println("Sure.");
            } else if (input.endsWith("!")) {
                System.out.println("Woah, Chill out!");
            } else if (trimmed.equals(emptyInput)) {
                System.out.println("Fine, Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        } while (!input.equalsIgnoreCase("bye"));
        System.out.println("Have a nice day it was nice talking to you!");
    }
}
