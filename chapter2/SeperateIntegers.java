package tdd.chapter2;
import java.util.Scanner;

public class SeperateIntegers {
    public static void main(String[] args) {


        System.out.print("Enter the digit to print seperately :- ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int divide;
        if ((number > 9999) && (number <= 99999)) {
            divide = 10000;
        } else if ((number > 999) && (number <= 9999)) {
            divide = 1000;
        } else if ((number > 99) && (number <= 999)) {
            divide = 100;
        } else if ((number > 9) && (number <= 99)) {
            divide = 10;
        } else {
            divide = 1;
        }
        quotientFinder(number, divide);
    }

        public static void quotientFinder (int numberValue, int divideValue) {
            for (int count = 1; divideValue!= 0; count++){
                int quotientValue = numberValue / divideValue;
                numberValue = numberValue % divideValue;
                System.out.printf("%d   ", quotientValue);
                divideValue /= 10;




           }

        }

    }
