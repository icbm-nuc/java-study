package generic.test.ex2;

public class Pair <T1,T2>{

    private T1 data1;
    private T2 data2;

    public void setFirst(T1 data) {
        data1 = data;
    }

    public void setSecond(T2 data) {
        data2 = data;
    }

    public T1 getFirst() {
        return data1;
    }

    public T2 getSecond() {
        return data2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "data1=" + data1 +
                ", data2=" + data2 +
                '}';
    }
}
