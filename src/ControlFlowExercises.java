import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        //While loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
        //Do While loop
//        int a = 100;
//        do{
//            System.out.println(a);
//            a -= 5;
//        } while(a >= -10);
//        //Second Do While loop
//        long b = 2;
//        do{
//            System.out.println(b);
//            b *= b;
//        }while(b <= 1000000);
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //Refactor previous exercises using for loop
        for (int d = 5; d <= 15; d++){
            System.out.println(d);
        }

        for(int e = 100; e >= -10; e -= 5){
            System.out.println(e);
        }

        for(long f = 2; f <= 1000000; f *= f){
            System.out.println(f);
        }
    }

}
