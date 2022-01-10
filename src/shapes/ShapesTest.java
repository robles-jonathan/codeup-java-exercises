package shapes;

public class ShapesTest {
    public static void main(String[] Args){
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        // Square box2Override = new Square(5);
        // System.out.println(box2Override.getArea());
        // System.out.println(box2Override.getPerimeter());

        Rectangle b1 = new Rectangle();
        b1.sayHello();
        Rectangle s1 = new Square();
        s1.sayHello();
        

    }
}
