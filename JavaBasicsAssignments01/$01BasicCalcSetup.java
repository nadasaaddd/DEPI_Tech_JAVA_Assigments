package JavaBasicsAssignments01;

public class $01BasicCalcSetup {
    static int num1 = 15;
    static double num2 = 7.5;
    static double Pi = 3.14159;

    public static void main(String[] args) {

        System.out.println("1st Num= " + num1 + "\n2nd Num= " + num2 + "\nPi= " + Pi);
        sum();
        difference();
        product();
        quotient();
        remainder();
    }

    static void sum() {
        double sum = num1 + num2;
        System.out.println("Sum result =" + sum);
    }

    static void difference() {
        double diff = num1 - num2;
        System.out.println("Difference result =" + diff);
    }

    static void product() {
        double product = num1 * num2;
        System.out.println("Product result =" + product);
    }

    static void quotient() {
        double quotient = num1 / num2;
        System.out.println("Quotient result =" + quotient);
    }

    static void remainder() {
        double rem = num1 % num2;
        System.out.println("Remainder result = " + rem);
    }
}
