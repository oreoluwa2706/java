package tdd.CHAPTER3.ClassAccount;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account oreoluwaAccount = new Account("Oreoluwa", 900000000.00);

        System.out.printf("initial name is: %s%n%n", oreoluwaAccount.getName());

        System.out.println("kindly enter your name: ");

        String myName = input.nextLine();

        oreoluwaAccount.setName(myName);

        System.out.println();

        System.out.printf("Your name is %s%n", oreoluwaAccount.getName());


    }
}
