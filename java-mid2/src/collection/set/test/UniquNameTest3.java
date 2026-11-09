package collection.set.test;

import java.util.*;

public class UniquNameTest3 {

    static void main(String[] args) {

        Set<Integer> set = new TreeSet<>(List.of(new Integer[]{30,20,20,10,10}));

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
