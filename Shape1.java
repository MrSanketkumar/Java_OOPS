import java.util.*;

class Shape {
    String colour;
    Boolean filled;


    public Shape(String colour , Boolean filled){
        this.colour =colour;
        this.filled = filled;
    }
    public double getarea(){
        return 0;
    }
   
}

class Circle extends Shape{
    double radius;

    public Circle (String colour , Boolean filled,double radius){
        super(colour, filled);
        this.radius = radius;
        
    }

    public double getarea(){
        return Math.PI*radius*radius;
    }
}

public class Shape1 {

    public static void main(String[] args) {
        
            Circle myCircle = new Circle("red", true, 2.0);

            System.out.println("Circle Color: " + myCircle.colour);
            System.out.println("Circle Filled: " + myCircle.filled);

            double area = myCircle.getarea();
            System.out.println("Circle Area: " + area);
           
    }
}