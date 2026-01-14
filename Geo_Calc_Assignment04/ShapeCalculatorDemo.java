package Geo_Calc_Assignment04;

import java.util.ArrayList;
import java.util.List;

public class ShapeCalculatorDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        System.out.println("--- Geometric Shape Calculator Demo ---");

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getName());
            System.out.printf("Area: %.2f%n", shape.getArea());
            System.out.printf("Perimeter: %.2f%n", shape.getPerimeter());
            System.out.println();
        }
        System.out.println("---End of Demo---");
    }
}
