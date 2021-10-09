package inventory.instruments;

public class Drum extends Instrument{

    private final int drumsInSet;

    public Drum(double wholesalePrice, double salePrice, Type instrumentType, String material, int drumsInSet) {
        super(wholesalePrice, salePrice, instrumentType, material);
        this.drumsInSet = drumsInSet;
    }

    public int getDrumsInSet() {
        return drumsInSet;
    }
}
