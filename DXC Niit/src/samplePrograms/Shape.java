package samplePrograms;

import java.util.Scanner;

interface Shape{
    double getArea();
    double getPerimeter();
}

abstract class AbstractShape implements Shape{
    String colour;
    
    AbstractShape(String colour){
        this.colour = colour;
    }
    
    public String toString(){
        return "colour="+colour;
    }
}

class Rectangle extends AbstractShape{
    private int length, breadth;
    Rectangle(String colour, int length, int breadth){
        super(colour);
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getPerimeter(){
        return 2*(length+breadth);
    }
    public double getArea(){
        return length*breadth;
    }
    
    public String toString(){
        return "Rectangle [colour="+colour+", length="+length+", breadth="+breadth+"]";
    }
}

class Circle extends AbstractShape{
    private int radius;
    
    Circle(String colour, int radius){
        super(colour);
        this.radius = radius;
    }
    
    public double getPerimeter(){
        return 2*Math.PI * radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    public String toString(){
        return "Circle [colour="+colour+", radius="+radius+"]";
    }
}

 class Source3{
    static void printShape(AbstractShape as){
        System.out.println("Area: "+(int)(as.getArea()+0.5)+",Perimeter: "+(int)(as.getPerimeter()+0.5));
    }
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String shape = scan.nextLine();
        if(shape.equalsIgnoreCase("circle")){
            String colour = scan.nextLine();
            int radius = Integer.parseInt(scan.nextLine());
            AbstractShape as = new Circle(colour, radius);
            System.out.println(as);
        }
        else if(shape.equalsIgnoreCase("rectangle")) {
        	String colour = scan.nextLine();
            int length = Integer.parseInt(scan.nextLine());
            int breadth= Integer.parseInt(scan.nextLine());
            AbstractShape as = new Rectangle(colour, length, breadth);
            System.out.println(as);
        }
        else {}
    }
}