import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
//        System.out.println("random: " + randomNum);
        while(true){
            System.out.println("Enter a number between 1 - 100: ");
            int guess1 = scanner.nextInt();
            if(guess1 < randomNum){
                System.out.println("Number is too low.");
            }else if(guess1 > randomNum){
                System.out.println("Number is too high.");
            }else {
                System.out.println("Correct!");
                break;
            }
        }
    }
}
