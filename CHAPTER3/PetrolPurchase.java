package tdd.CHAPTER3;

public class PetrolPurchase {
    public String stationLocation;
    public String petrolType;
    public int quantity;
    public double pricePerLiter;
    public double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType, int quantity, double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }


    public String getStationLocation() {
        return stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public double getCheckPercentageDiscount() {
        return percentageDiscount;
    }

    public double getNetPurchaseAmount() {
        double netPurchaseAmount = ((quantity * pricePerLiter) - (quantity * pricePerLiter * percentageDiscount));
        return netPurchaseAmount;
    }
}

