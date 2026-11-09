package collection.deque;

import java.util.Stack;

public class StackMain {

    static void main(String[] args) {
        //스택은 사용 x vector 사용해서 느림
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        //다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());
    }
}
