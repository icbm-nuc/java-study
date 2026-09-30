package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrder = new ProductOrder[3];

        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;
        productOrder[0] = tofu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        productOrder[1] = kimchi;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;
        productOrder[2] = coke;

        int totalPrice = 0;
        for (ProductOrder order : productOrder) {
            System.out.println("상품명: " + order.productName + "가격: " + order.price + " 수량: " + order.quantity);
            totalPrice += order.price * order.quantity;
        }

        System.out.println("총 결제 금액: " + totalPrice);


    }
}
