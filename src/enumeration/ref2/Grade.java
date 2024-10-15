package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercents;

    Grade(int discounPercents) {
        this.discountPercents = discounPercents;
    }

    public int getDiscounPercents() {
        return discountPercents;
    }
}
