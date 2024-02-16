
package learningbasicjava;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radious, area;
        System.out.print("Enter Radious: ");
        radious = input.nextDouble();
        area = 3.1416 * radious * radious;
        System.out.println("Area of Circle: " + area);
    }
    
}
