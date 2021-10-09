package inventory.instruments;

import inventory.Inventory;

public abstract class Instrument extends Inventory implements IPlay{

    private final Type instrumentType;
    private final String material;

    public Instrument(double wholesalePrice, double salePrice, Type instrumentType, String material) {
        super(wholesalePrice, salePrice);
        this.instrumentType = instrumentType;
        this.material = material;
    }

    public Type getInstrumentType() {
        return this.instrumentType;
    }

    public String getMaterial() {
        return this.material;
    }
}
