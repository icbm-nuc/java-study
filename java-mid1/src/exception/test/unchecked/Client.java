package exception.test.unchecked;

public class Client {

    public void call(){
        throw new MyUncheckedException("ex");
    }
}
