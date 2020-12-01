package enumeration;

public enum How {
    CALMLY,
    RESTLESSLY;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
