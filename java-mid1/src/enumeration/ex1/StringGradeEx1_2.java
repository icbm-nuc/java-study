package enumeration.ex1;



public class StringGradeEx1_2 {

    static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int vip = discountService.discount("VIP",price);
        int basic = discountService.discount("BASIC",price);
        int gold = discountService.discount("gold",price);
        int diamond = discountService.discount("DIAMOND",price);


        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("gold 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
