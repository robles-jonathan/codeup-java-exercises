package shapes;

public class Square extends Rectangle {
    
    //Empty Constructor
    public Square(){
    }

    //Constructor with one Arg
    public Square(int side){
        super(side, side);
    }

    //Override getArea()
    public int getArea(){
        System.out.println("using Override");
        return (int) Math.pow(width, 2);
    }

    //Overrride getPerimeter()
    public int getPerimeter(){
        System.out.println("using Override");
        return 4 * width;
    }

    public void sayHello(){
        System.out.println("How can I help you?");
    }

}
