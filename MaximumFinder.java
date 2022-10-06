package tdd;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating point numbers seperated by spaces: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.print("Maximum is: " + result);

    }
    public static double maximum(double number1, double number2, double number3) {

        double maximumNumber = number1;

        if(number2 > maximumNumber) {
            maximumNumber = number2;
        }

        if(number3 > maximumNumber) {
            maximumNumber = number3;
        }
        return maximumNumber;

    }
}
