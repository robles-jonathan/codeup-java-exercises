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

}
