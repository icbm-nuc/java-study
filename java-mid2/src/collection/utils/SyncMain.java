package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {

    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 쓰레드 1
        list.add(1);
        list.add(2);
        list.add(3);

        // 쓰레드 2
        list.remove(1);
        list.remove(1);


        System.out.println("list class = " + list.getClass());
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList = " + synchronizedList.getClass());
    }
}
