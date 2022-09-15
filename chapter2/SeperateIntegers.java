package tdd.chapter2;
import java.util.Scanner;

public class SeperateIntegers {
    public static void main(String[] args) {


        System.out.print("Enter the digit to print seperately :- ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int divider;
        if ((number > 9999) && (number <= 99999)) {
            divider = 10000;
        } else if ((number > 999) && (number <= 9999)) {
            divider = 1000;
        } else if ((number > 99) && (number <= 999)) {
            divider = 100;
        } else if ((number > 9) && (number <= 99)) {
            divider = 10;
        } else {
            divider = 1;
        }
        quotientFinder(number, divider);
    }

        public static void quotientFinder (int numberValue, int dividerValue) {
            for (int count = 1; dividerValue!= 0; count++){
                int quotientValue = numberValue / dividerValue;
                numberValue = numberValue % dividerValue;
                System.out.printf("%d   ", quotientValue);
                dividerValue /= 10;




           }

        }

    }
