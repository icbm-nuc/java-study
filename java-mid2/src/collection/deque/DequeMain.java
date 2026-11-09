package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

    static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        // 데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());

        System.out.println(deque);
    }
}
