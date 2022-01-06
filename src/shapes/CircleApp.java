package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input test = new Input(sc);
        System.out.print("To determine the area and circumference of a circle enter the radius of the circle: ");
        Circle c = new Circle(test.getDouble());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
    }
/**TODO: After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another. Continue creating circles and displaying information about them until the user says they do not want to continue.

 Before exiting, the program should output the total number of circles created. Use a private static field, along with a public static method to keep track of and display the total number of circles created.*/
}
