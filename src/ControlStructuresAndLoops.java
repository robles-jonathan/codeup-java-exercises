import java.util.Scanner;

public class ControlStructuresAndLoops {
    public static void main(String[] args) {
//        System.out.println(read10Nums());
        cubedToNumber();
    }
    /**TODO: Write a program in Java to read 10 numbers from keyboard and find their sum and average
     * */
    public static String read10Nums(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();
        int int5 = scanner.nextInt();
        int int6 = scanner.nextInt();
        int int7 = scanner.nextInt();
        int int8 = scanner.nextInt();
        int int9 = scanner.nextInt();
        int int10 = scanner.nextInt();
        int total = int1 + int2 + int3 + int4 + int5 + int6 + int7 + int8 + int9 + int10;
        double avg = total/10.0;
        return "The sum of 10 numbers is : " + total +
                "\nThe average of 10 numbers is: " + avg;
    }

    /**TODO: Write a program in Java to display the cube of the number upto given an integer. Read the number using the Scanner class.
     **/
    public static void cubedToNumber(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        for (var i = 1; i <= num; i++){
            int cubed = (int) Math.pow(i,3);
            System.out.println("The number is " + i + " and cube of " + i + " is : " + cubed);
        }
    }
}
