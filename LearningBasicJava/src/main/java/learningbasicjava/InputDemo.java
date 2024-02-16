package learningbasicjava;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter any integer number: ");
        number = input.nextInt();
        input.nextLine();
        System.out.println("Number: " + number);
        String name;
        System.out.print("Enter any string: ");
        name = input.nextLine();
        System.out.println("String: " + name);
    }
}
