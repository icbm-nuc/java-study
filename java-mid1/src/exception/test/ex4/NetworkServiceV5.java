package exception.test.ex4;

import exception.test.ex4.exception.ConnectExceptionV4;
import exception.test.ex4.exception.SendExceptionV4;

public class NetworkServiceV5 {

    public void sendMessage(String data) throws Exception {
        String address = "https://google.com";


        try(NetworkClientV5 client = new NetworkClientV5(address);){
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[알 수 었는 오류] 메시지 : " + e.getMessage());
            throw e;
        }

    }
}
