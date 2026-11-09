package collection.Map.test.cart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product,Integer> cartMap = new HashMap<>();


    public void add(Product product, int addquantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + addquantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int minusQuantity) {
//        if(cart.get(product) - count < 0) {
//            cart.remove(product);
//        }
//        cart.put(product,cart.get(product) - count);

        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuantity;
        if(newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product,newQuantity);
        }

    }


}
