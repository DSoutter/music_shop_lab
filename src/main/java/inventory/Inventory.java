package inventory;

public abstract class Inventory implements ISell{

    private final double wholesalePrice;
    private final double salePrice;

    public Inventory(double wholesalePrice, double salePrice) {
        this.wholesalePrice = wholesalePrice;
        this.salePrice = salePrice;
    }

    public double getWholesalePrice() {
        return this.wholesalePrice;
    }

    public double getSalePrice() {
        return this.salePrice;
    }
}
