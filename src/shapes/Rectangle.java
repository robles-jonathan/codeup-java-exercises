package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width){
        super(length, width);
    }


    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
//    protected int length;
//    protected int width;
//
//    //Empty Constructor
//    public Rectangle(){
//    }
//
//    //Constructor with two Args
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//
//    public void sayHello(){
//        System.out.println("Hello, World!");
//    }

}
