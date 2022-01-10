package shapes;

public class ShapesTest {
    public static void main(String[] Args){
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//
        Measurable myShape = new Square(7);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShape2 = new Rectangle(25, 14);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }
}
