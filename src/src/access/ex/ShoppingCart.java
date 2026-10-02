package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10]; // 최대 10개의 물건을 담을 수 있는 배열
    private int itemCount = 0;           // 현재 담긴 물건의 개수

    // 카트에 아이템 추가
    public void addItem(Item item) {
        // 배열 용량이 가득 찼는지 체크
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 차서 더 이상 담을 수 없습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
        System.out.println(item.getName() + "이(가) 장바구니에 담겼습니다.");
    }

    // 장바구니 내역 및 총 금액 출력
    public void displayItems() {
        System.out.println("\n=== 장바구니 상품 목록 ===");
        if (itemCount == 0) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        int totalPrice = 0;
        // 배열 전체가 아닌 실제로 담긴 itemCount 만큼만 반복 실행
        for (int i = 0; i < itemCount; i++) {
            items[i].printItem();
            totalPrice += items[i].getTotalPrice();


        }

        System.out.println("---------------------------");
        System.out.println("총 결제 금액: " + totalPrice + "원");
    }
}