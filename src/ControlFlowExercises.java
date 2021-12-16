import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //While loop
        int i = 5;
        while (i <= 15) {
            System.out.println(i++);
        }
        //Do While loop
        int a = 100;
        do{
            System.out.println(a);
            a -= 5;
        } while(a >= -10);
    }
}
