package Review18;

import java.util.ArrayList;

abstract class Shape{
    public abstract double area();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius =radius;
    }
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    double width, height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){
        return width * height;
    }
}
class Trianlge extends Shape{
    double base, height;
    Trianlge(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double area(){
        return 0.5 * base * height;
    }
}
public class Main {
    public static double totalArea(ArrayList<Shape> shapes){
         double total = 0;
         for(Shape s:shapes){
             total += s.area();
         }
         return total;
    }

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(5,4));
        shapes.add(new Trianlge(5,4));
        for(Shape s:shapes){
            System.out.println(s.area());
        }
        System.out.println("Total= " + totalArea(shapes));
    }
}
