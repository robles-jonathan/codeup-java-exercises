import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~FIZZBUZZ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        for (int i = 1; i <= 100; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }
    }

}
