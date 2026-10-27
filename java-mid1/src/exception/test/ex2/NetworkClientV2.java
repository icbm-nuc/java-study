package exception.test.ex2;

public class NetworkClientV2 {

    private String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void initError(String message) {
        if(message.contains("error1")){
            connectError = true;
        }
        if(message.contains("error2")){
            sendError = true;
        }
    }

    public void connect() throws NetworkClientExceptionV2 {
        if(connectError){
            throw new NetworkClientExceptionV2("connectError",address + "서버에 연결 실패");
        }

        System.out.println(address + "서버 연결 성공");
    }

    public void send(String message) throws NetworkClientExceptionV2 {
        if(sendError){
           throw new NetworkClientExceptionV2("sendError", address + "서버에 데이터 전송 실패 : " + message);
        }
        System.out.println(address + "서버에 전송 성공 : " + message);
    }

    public void disconnect() {
        System.out.println(address + "서버에 연결 해제");
    }
}
