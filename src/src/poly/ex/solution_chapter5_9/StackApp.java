
package poly.ex.solution_chapter5_9;

import java.util.Scanner;

public class StackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 스택 크기 입력받기
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int capacity = scanner.nextInt();

        // 입력 버퍼 비우기 (nextInt 사용 후 남은 개행문자 제거)
        scanner.nextLine();

        // 스택 생성
        Stack stack = new StringStack(capacity);

        // 2. "그만"이 입력될 때까지 계속 문자열 추가
        while (true) {
            System.out.print("문자열 입력 >> ");
            String input = scanner.nextLine();

            // "그만"을 입력하면 반복문 종료
            if (input.equals("그만")) {
                break;
            }

            // 스택에 넣기 시도
            boolean result = stack.push(input);
            if (!result) {
                System.out.println("스택이 가득 차서 더 이상 넣을 수 없습니다.");
            }
        }

        // 3. 스택에 저장된 모든 문자열 pop하여 출력
        System.out.println("\n스택에 저장된 모든 문자열 팝:");
        while (stack.length() > 0) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println(); // 줄바꿈

        scanner.close();
    }
}