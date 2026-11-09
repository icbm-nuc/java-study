package collection.set.test;

import java.util.HashSet;

public class UniquNameTest1 {

    static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : inputArr) {
            set.add(integer);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
