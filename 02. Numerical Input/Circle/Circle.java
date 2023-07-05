import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    final double PI = 3.14159;
    final String TAB = "\t";
    final String NEWLINE = "\n";

    double radius, area, circumference;

    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius : ");
        this.radius = scanner.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat("0.000");

        System.out.println("Radius of the Circle        : "+decimalFormat.format(radius)+NEWLINE);
        System.out.println("Area of the Circle          : "+decimalFormat.format(getArea())+NEWLINE);
        System.out.println("Circumference of the Circle : "+decimalFormat.format(getCircumference())+NEWLINE);

    }

    public double getArea(){
        return PI*radius*radius;
    }

    public double getCircumference(){
        return 2D*PI*radius;
    }
}
