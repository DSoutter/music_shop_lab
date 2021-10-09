package inventory.instruments;

public class Guitar extends Instrument{

    private final int numOfStrings;

    public Guitar(double wholesalePrice, double salePrice, Type instrumentType, String material, int numOfStrings) {
        super(wholesalePrice, salePrice, instrumentType, material);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }
}
