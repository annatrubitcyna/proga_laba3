package enumeration;

public enum Speed {
    SLOWLY,
    NORMAL,
    QUICKLY;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
