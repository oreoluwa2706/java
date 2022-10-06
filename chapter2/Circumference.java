package tdd.chapter2;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number as radius: ");
        double radius = input.nextInt();

         System.out.printf("%8S%12S%15S%6S%n", "radius", "diameter","circumference","area");
        double diameter = 2 *  radius;

        double circumference = 2 * 3.14159 * radius;

        double area = 3.14159 * (radius * radius);
        System.out.printf("%8.2f%12.2f%15.2f%8.2f%n", radius, diameter, circumference, area  );
    }
}
