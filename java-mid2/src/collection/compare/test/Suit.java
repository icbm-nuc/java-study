package collection.compare.test;

public enum Suit {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLUB("♣");


    public String getIcon() {
        return icon;
    }

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }
}
