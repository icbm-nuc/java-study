package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeQueueMain {

    static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //단순히 queue 기능만 필요할때
        //Queue<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());

        //데이터꺼내기
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println(deque);
        //큐 는 offer poll peek
    }
}
