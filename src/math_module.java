
import java.util.Scanner;

public class math_module {
    public static void main(String[] args) {

//        double number = Math.pow(2,3);
//        System.out.println(number);
//        double result = Math.sqrt(25);
//        System.out.println(result);
//        double result1 = Math.abs(-5);
//        System.out.println(result1);
//        double result2 = Math.ceil(5.3);
//        System.out.println(result2);
//        double result3 = Math.floor(5.3);
//        System.out.println(result3);




//  calculate hypotenuse

        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the base of triangle: ");
//        double a = scanner.nextDouble();
//        double A = Math.pow(a,2);
//        System.out.println("enter the height of triangle is :");
//        double b = scanner.nextDouble();
//        double B = Math.pow(b,2);
//
//        double c = Math.sqrt(A+B);
//        System.out.println("the hypotenuse of triangle is: " + c);


//  calculate area,volume and circumference of circle
// area = pi * r* r
//  circumference = 2 * pi * r
//   volume = (3.0)/(4.0)*pi*r*r*


        System.out.println("enter the radius of the circle:");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("the area of the circle is: " + area);

        double circumference = 2 * Math.PI * radius;
        System.out.println("the circumference of the circle is: " + circumference);

        double volume = (4.0/3.0) * Math.PI * radius * radius * radius;
        System.out.println("the volume of the circle is: " + volume);



    }
}
