package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 4);
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }


//    //Empty Constructor
//    public Square(){
//    }
//
//    //Constructor with one Arg
//    public Square(int side){
//        super(side, side);
//    }
//
//    //Override getArea()
//    public int getArea(){
//        System.out.println("using Override");
//        return (int) Math.pow(width, 2);
//    }
//
//    //Overrride getPerimeter()
//    public int getPerimeter(){
//        System.out.println("using Override");
//        return 4 * width;
//    }
//
//    public void sayHello(){
//        System.out.println("How can I help you?");
//    }

}
