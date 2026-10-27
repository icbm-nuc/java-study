package exception.test.ex0;

public class NetworkClientV0 {

   String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println(address + "서버 연결 성공 ");
        return "success";
    }

    public String send(String message) {
        System.out.println(address + "서버에 데이터 전송 : " + message);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + "에 연결 해제");

    }
}
