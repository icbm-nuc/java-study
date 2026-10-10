package lang.test.ex319p_10;

abstract class PairMap {
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key,String value);
    abstract String delete(String key);
    abstract int length();

    protected PairMap(int value){
        keyArray = new String[value];
        valueArray = new String[value];
    }
}
