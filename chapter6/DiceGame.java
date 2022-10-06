package tdd.chapter6;

import java.security.SecureRandom;

public class DiceGame {

    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {WON, LOST, CONTINUE}

    ;

    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int TWELVE = 12;
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;

    public static void main(String[] args) {
        int point = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case ELEVEN:
                gameStatus = Status.WON;
                break;

            case TWO:
            case THREE:
            case TWELVE:
                gameStatus = Status.LOST;
                break;

            default:
                gameStatus = Status.CONTINUE;
                point = sumOfDice;
                System.out.printf("point is %d%n", point);
                break;

        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == point) {
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN || sumOfDice == ELEVEN){
                    gameStatus = Status.LOST;
                }
            }
        }

        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;

    }
}

