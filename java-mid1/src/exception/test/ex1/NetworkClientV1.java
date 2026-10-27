package exception.test.ex1;

public class NetworkClientV1 {

    private String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
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

    public String connect() {
        if(connectError){
            System.out.println(address + "서버 연결 실패");
            return "connectError";
        }

        System.out.println(address + "서버 연결 성공");
        return "Success";
    }

    public String send(String message) {
        if(sendError){
            System.out.println(address + "서버에 전송 실패 : " + message);
            return "sendError";
        }
        System.out.println(address + "서버에 전송 성공 : " + message);
        return "Success";
    }

    public void disconnect() {
        System.out.println(address + "서버에 연결 해제");
    }
}
