package JavaBasicsAssignments01;

public class $07Methods {
    public void main(String[] args) {
        double area = calculateArea(5.5, 7.5);
        System.out.println("Area = " + area);
        printGreeting("Nada");
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java class.");
    }
}
