package tdd.CHAPTER3;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("iko", "lols", 10, 20.56, 0.05);
        System.out.printf("NetPurchasePrise is %.2f", petrol.getNetPurchaseAmount());


    }


}
