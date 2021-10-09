package inventory.instruments;

public enum Type {

    GUITAR("Strum"),
    PIANO("Clang"),
    DRUM("Badum Tss"),
    WIND("whhhhh");

    private final String sound;

    Type(String sound) {
        this.sound = sound;
    }

    public String getSound(){
        return this.sound;
    }
}
