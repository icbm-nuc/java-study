package poly.ex.sender;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String welcome) {
        System.out.println("SMS을 발송합니다: " + welcome);
    }
}
