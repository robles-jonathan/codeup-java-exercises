package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input test = new Input(sc);

        System.out.println("What is your fave color?");
        System.out.println(test.getString());

        System.out.println("Continue?");
        System.out.println(test.yesNo());

        System.out.println(test.getInt(1,100));

        System.out.println("Enter an Int");
        System.out.println(test.getInt());


        System.out.println(test.getDouble(1,100));

        System.out.println("Enter an Double");
        System.out.println(test.getDouble());
    }
}
