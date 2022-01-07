import java.util.Random;

import javax.sound.sampled.SourceDataLine;

public class ServerNameGenerator {

	// Create an array that holds 10 adjectives in an array
	static String[] adjectives = {
			"Charming",
			"Cruel",
			"Fantastic",
			"Gentle",
			"Huge",
			"Perfect",
			"Rough",
			"Sharp",
			"Tasty",
			"Zealous"
	};
	static String[] nouns = {
			"man",
			"mountain",
			"state",
			"ocean",
			"country",
			"building",
			"cat",
			"airline",
			"house",
			"bird"
	};

	public static String randElement(String[] array){
        // get the random number from a 1 -10;
		Random rand = new Random();
        int randElementIndex = rand.nextInt(10);
		System.out.println(randElementIndex);
        // find the element at random index
        String randElement = array[randElementIndex];
        return randElement;
    }
	public static void main(String[] args) {
		String word1 = randElement(nouns);
		String word2 = randElement(adjectives);
		String serverName = word1 + "-" + word2;
		System.out.printf("Here is your server name:\n %s",serverName);
		}
}
/**
 * TODO:
 * Create two arrays whose elements are strings: one with at least 10
 * adjectives, another with at least 10 nouns.
 *
 * Create a method that will return a random element from an array of strings.
 *
 * Add a main method, and inside of your main method select and random noun and
 * adjective and hyphenate the combination and display the generated name to the
 * user.
 */