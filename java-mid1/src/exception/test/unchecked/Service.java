package exception.test.unchecked;

public class Service {

    Client client = new Client();

    public void callCatch(){
        try{
            client.call();
        } catch (MyUncheckedException e){
            System.out.println("예외 처리 message = " + e.getMessage());
        }
    }

    public void callThrow(){
        client.call();
    }
}
