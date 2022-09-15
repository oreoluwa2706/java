package tdd.chapter4;

import java.util.Scanner;

public class CreditCalculator {
    /**
     (Credit Limit Calculator) Develop a Java application that determines whether any of several department-store customers has exceeded the credit limit on a charge account. For each customer, the following facts are available:
     a) account number
     b) balance at the beginning of the month
     c) total of all items charged by the customer this month
     d) total of all credits applied to the customer’s account this month
     e) allowed credit limit.
     The program should input all these facts as integers, calculate the new balance (= beginning balance
     + charges – credits), display the new balance and determine whether the new balance exceeds the
     customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded"

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int newBalance = 0;

        System.out.println("Enter beginning balance");
        int beginingBalance = input.nextInt();

        System.out.println("Enter charges");
        int charges = input.nextInt();

        System.out.println("Enter credits");
        int credits = input.nextInt();

        {
            newBalance = beginingBalance + charges - credits;

            if (newBalance > credits) {

                System.out.printf("new balance is %d", newBalance);
            } else if (credits > newBalance)

            {
                System.out.print("Credit limit exceeded");


        }
    }




    }
}
