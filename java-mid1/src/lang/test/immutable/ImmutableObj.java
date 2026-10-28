package lang.test.immutable;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int value) {
        int result = this.value + value;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }

}
