package network.tcp.autocloseable;

public class ResourceCloseMainV4 {

    static void main(String[] args) {
        try {
            logic();
        }  catch (CallException e) {
            System.out.println("CallException 예외 처리");
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable throwable : suppressed) {
                System.out.println("suppressedEx = " + throwable);
            }
            e.printStackTrace();

        }  catch (CloseException e) {
            System.out.println("CloseException 예외 처리");
            e.printStackTrace();
        }
    }

    private static void logic() throws CallException, CloseException {
        /**
         * 2가지 핵심 문제
         * 1. close() 시점에 실수로 예외를 던지면, 이후 다른 자원을 닫을 수 없는 문제 발생
         * 2. finally 블럭 안에서 자원을 닫을 때 예외가 발생하면, 핵심 예외가 finally에서 발생한 부가 예외로 바뀌어 버린다.
         * 그리고 핵심 예외가 사라짐
         *
         * 4가지 부가 문제
         * 3. resource 변수를 선언하면서 동시에 할당할 수 없음 (try, finally 코드 블록과 변수 스코프가 다른 문제)
         * 4. catch 이후에 finally 호출, 자원 정리가 조금 늦어진다.
         * 5. 개발자가 실수로 close() 를 호출하지 않을 가능성
         * 6. 개발자가 close() 호출 순서를 실수, 보통 자원을 생성한 순서와 반대로 닫아야 함
         */
        try (ResourceV2 resource1 = new ResourceV2("resource1");
             ResourceV2 resource2 = new ResourceV2("resource2")) {
            //resource2.close()
            //resource1.close() 선언 순서 반대로됨

            resource1.call();
            resource2.callEx(); // CallException
        } catch (CallException e) {
            System.out.println("ex: " + e);
            throw e;
        }
    }
}
