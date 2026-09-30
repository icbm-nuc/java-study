package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrder = new ProductOrder[n];
        for (int i = 0; i < productOrder.length; i++){
            System.out.println(i+1+"번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            scanner.nextLine(); // 버퍼제거

            productOrder[i] = createOrder(productName,price,quantity);
        }
//
//
//        productOrder[1] = createOrder("김치",5000,1);
//        productOrder[2] = createOrder("콜라",1500,2);

        printOrder(productOrder);
        int totalPrice = getTotalAmout(productOrder);
        System.out.println("총 금액 : " + totalPrice);

    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + "가격: " + order.price + " 수량: " + order.quantity);
        }
    }
    static int getTotalAmout(ProductOrder[] orders){
        int totalPrice=0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }

        return totalPrice;
    }
}
