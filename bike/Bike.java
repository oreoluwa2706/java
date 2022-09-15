package tdd.bike;

public class Bike {
    private boolean power;
    private int gearNumber;

    private int acceleration;


    public void  powerOn(boolean on)  {
        if(on == true) {
            power = true;
        }
            else {
                power = false;
            }
        }

    public boolean checkPower() {
        return power;

    }

    public void gear(int  number) {

        gearNumber = number;
    }

    public int checkGear() {

        return gearNumber;
    }

    public void accelerate(int speed) {
        if(gearNumber == 1) {
        acceleration = speed + 1;
        }
        else if(gearNumber == 2) {
            acceleration = speed +2;
            }
        else if(gearNumber == 3){
            acceleration = speed + 3;
        }
        else if(gearNumber == 4){
            acceleration = speed + 4;
        }
    }


    public int checkAcceleration() {
        return acceleration;
    }

    public void decelerate(int speed) {
        if(gearNumber == 1) {
            acceleration = speed - 1;
        }
        else if(gearNumber == 2) {
            acceleration = speed -2;
        }
        else if (gearNumber == 3) {
            acceleration = speed - 3;
        }
        else if (gearNumber == 4) {
            acceleration = speed - 4;
        }


    }
}
