
package learningbasicjava;

import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height;
        System.out.print("Enter base: ");
        base = input.nextDouble();

        System.out.print("Enter height: ");
        height = input.nextDouble();
        System.out.println("Area of triangle: " + .5 * base * height);
    }
}
