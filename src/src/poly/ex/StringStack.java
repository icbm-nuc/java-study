package poly.ex;

public class StringStack implements Stack{
    private String[] data;
    private int length;
    private int capacity;

    public StringStack(int capacity){
        this.capacity = capacity;
        int length =0;
        this.data = new String[capacity];
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public String pop() {

        if (length == 0) {
            return null;
        }

        length--;
        String poppedValue = data[length];


        data[length] = null;

        return poppedValue;
    }

    @Override
    public boolean push(String val) {

        if (length < capacity) {
            data[length] = val;
            length++;
            return true;
        }

        // 가득 찬 경우 저장하지 못하고 false 반환
        return false;
    }


}
