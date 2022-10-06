package tdd.chapter2; /**(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
the user and prints the square of each, the sum of their squares, and the difference of the squares (first
number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
*/

import java.util.Scanner;

public class Arithmetic {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer number: ");
int number1 = input.nextInt();

int squareNumber1 = number1 * number1;
System.out.printf("square of number1 integer is %d%n ", squareNumber1);

System.out.print("Enter the second integer number: ");
int number2 = input.nextInt();

int squareNumber2 = number2 * number2;
System.out.printf("square of number2 integer is %d%n ", squareNumber2);

int squareSum = squareNumber1 + squareNumber2;
System.out.printf("sum of the inter square is %d%n ", squareSum);

int squareDifferences = squareNumber1 - squareNumber2;
System.out.printf("square differences is %d ", squareDifferences);

}

 }