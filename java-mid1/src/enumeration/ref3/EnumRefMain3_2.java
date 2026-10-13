package enumeration.ref3;

public class EnumRefMain3_2 {

    static void main(String[] args) {
        int price = 10000;

        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.BASIC.discount(price));

    }
}
