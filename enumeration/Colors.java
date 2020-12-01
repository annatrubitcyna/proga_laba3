package enumeration;

public enum Colors {
    RED,
    GREEN,
    BLUE,
    ORANGE,
    WHITE,
    SKIN,
    PURPLE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
