package lang.string.test;

public class TestString10 {

    static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] splitFruits = fruits.split(",");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }

        String joinedString = String.join("->", splitFruits);
        System.out.println("joinedString = " + joinedString);
    }
}
