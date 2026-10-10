package lang.test.ex319p_10;

public class Dictionary extends PairMap{
    private int count =0;

    public Dictionary(int value){
        super(value);
    }

    @Override
    String get(String key) {
        for (int i = 0; i < length(); i++) {
            if(keyArray[i].equals(key)){
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for (int i = 0; i < length(); i++) {
            if(keyArray[i].equals(key)){
                valueArray[i] = value;
                return;
            }
        }

        keyArray[count] = key;
        valueArray[count] = value;
        count++;
    }

    @Override
    String delete(String key) {
        for (int i = 0; i < length(); i++) {
            if(keyArray[i].equals(key)){
                valueArray[i] = null;
                count--;
            }
        }
        return null;
    }

    @Override
    int length() {
        return count;
    }
}
