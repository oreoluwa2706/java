/**package tdd.chapter6;

public class Dice {
    public enum Status{WON, CONTINUE, LOST};
    public int sum;
    public Status gameStatus;

    int myPoint =0;

    public Status getStatus() {
        switch (sum){
         case 7, 11 -> gameStatus = Status.WON;
         case 2, 3, 12 -> gameStatus = Status.LOST;
         default -> gameStatus = Status.CONTINUE;
        }
        return gameStatus;
    }
    While(gameStatus == Status.CONTINUE) {
        sum = rollDice();

        if(sum == Status.CONTINUE){
            gameStatus = Status.WON;
        }
        else{
            if(sum == Status.WON){
                gameStatus = Status.LOST;
            }
        }


        
    }

    private int rollDice() {
    }
}

*/