package tdd.chapter6;

import java.security.SecureRandom;

public class RollDice {

    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        int roll1 = 0;
        int roll2 = 0;
        int roll3 = 0;
        int roll4 = 0;
        int roll5 = 0;
        int roll6 = 0;

        for(int counter = 1; counter <= 10_000_000; counter++) {
            int face = 1 + randomNumber.nextInt(6);

            switch (face) {
                case 1:
                    ++roll1;
                    break;

                case 2:
                    ++roll2;
                    break;

                case 3:
                    ++roll3;
                    break;

                case 4:
                    ++roll4;
                    break;

                case 5:
                    ++roll5;
                    break;

                case 6:
                    ++roll6;
                    break;
            }
        }

        System.out.println("face\troll");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n", roll1, roll2, roll3, roll4, roll5, roll6);




    }
}
