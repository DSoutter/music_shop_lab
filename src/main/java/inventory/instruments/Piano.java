package inventory.instruments;

public class Piano extends Instrument{

    private final int numOfKeys;

    public Piano(double wholesalePrice, double salePrice, Type instrumentType, String material, int numOfKeys) {
        super(wholesalePrice, salePrice, instrumentType, material);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return this.numOfKeys;
    }
}
