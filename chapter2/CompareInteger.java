package tdd.chapter2; /** (Comparing Integers) Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100.

*/

import java.util.Scanner;

public class CompareInteger {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter integer number: ");
int number = input.nextInt();

if (number > 100) {
   System.out.printf("%d > %d%n", number, 100);
}

if (number == 100) {
   System.out.printf("%d == %d%n", number, 100);
}
if (number!= 100) {
   System.out.printf("%d != %d%n", number,100);
}
if (number < 100) {
   System.out.printf("%d < %d%n", number, 100);
}

int numberSquare = number * number ;
  System.out.printf("square of number is %d%n", numberSquare);

if(numberSquare > 100) {
  System.out.printf("%d > %d%n", numberSquare, 100);
}
if(numberSquare == 100) {
  System.out.printf("%d == %d%n", numberSquare, 100);
}
if (numberSquare != 100) {
  System.out.printf("%d != %d%n", numberSquare, 100);
}
if(numberSquare < 100) {
  System.out.printf("%d < %d%n", numberSquare, 100);
}


 }

 } 