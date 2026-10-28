package exception.test.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String message)  {
        String address = "google.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(message);

        try{
            client.connect();
            client.send(message);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + " ,메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
