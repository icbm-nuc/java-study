package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

    public void printItem() {
        System.out.println("품목명:" + name + ", 단가:" + price + "원, 수량:" + quantity + "개 (합계: " + getTotalPrice() + "원)");
    }
}