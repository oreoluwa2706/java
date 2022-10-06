package tdd.chapter2; /**(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….
*/


import java.util.Scanner;

public class NumberApplication {

public static void main(String[] args) {

 
Scanner input = new Scanner(System.in);

System.out.print("Enter first integer number: ");
int number1 = input.nextInt();

System.out.print("Enter second integer number: ");
int number2 = input.nextInt();

System.out.print("Enter third integer number: ");
int number3 = input.nextInt();

int sum = number1 + number2 + number3;
System.out.printf("sum of the 3 integers is %d%n", sum);

int average = sum/3;
System.out.printf("average of the 3 integers is %d%n", average);

int product = number1 * number2 * number3;
System.out.printf("product of the 3 integers is %d%n", product);



int smallest = number1;
if(number2 < smallest)
smallest = number2;

if(number3 < smallest)
smallest = number3;

        System.out.printf("smallest of the 3 integers is %d%n", smallest);




int largest = number1;

if(number2 > largest)
largest = number2;

if(number3 > largest)
largest = number3; 
               
        
         
        System.out.printf("largest of the 3 integers is %d%n", largest);
    
    

  }

 }



 