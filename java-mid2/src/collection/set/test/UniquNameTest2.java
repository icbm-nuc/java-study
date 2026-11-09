package collection.set.test;

import java.util.*;

public class UniquNameTest2 {

    static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        List<Integer> list = List.of(inputArr);

        Set<Integer> set = new LinkedHashSet<>(list);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3); // 이거 권장

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
