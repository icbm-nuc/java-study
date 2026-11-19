package network.tcp.autocloseable;

public class ResourceCloseMainV3 {

    static void main(String[] args) {
        try {
            logic();
        }  catch (CallException e) {
            System.out.println("CallException 예외 처리");
            throw new RuntimeException(e);
        }  catch (CloseException e) {
            System.out.println("CloseException 예외 처리");
            throw new RuntimeException(e);
        }
    }

    private static void logic() throws CallException, CloseException {

        ResourceV1 resource1 = null;
        ResourceV1 resource2 = null;

        try {
            resource1 = new ResourceV1("resource1"); //
            resource2 = new ResourceV1("resource2");

            resource1.call();
            resource2.callEx(); // CallException
        } catch (CallException e) {
            System.out.println("ex: " + e);
            throw e;
        } finally {
            if (resource2 != null) {
                resource2.closeEx(); // CloseException 발생
            }
            if (resource1 != null) {
                resource1.closeEx();
            }

        }
/**
 * close() 시점에 실수로 예외를 던지면, 이후 다른 자원을 닫을 수 없는 문제 발생
 * finally 블럭 안에서 자원을 닫을 때 예외가 발생하면, 핵심 예외가 finally에서 발생한 ㅇ부가 예외로 바뀌어버림
 */

    }
}
