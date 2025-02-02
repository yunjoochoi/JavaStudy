package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> shoppingItems;

    public ShoppingCart() {
        this.shoppingItems = new ArrayList<Item>();
    }

    public void addItem(Item item){
        shoppingItems.add(item);
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        int sum=0;
        for (Item shoppingItem : shoppingItems) {
            System.out.println("상품명:"+shoppingItem.getName()+ ", 합계: "+shoppingItem.getTotalPrice());
        }
        System.out.println("전체 가격 합: "+sum);
    }

    private int calculateTotalPrice(){
        int sum=0;
        for (Item item:shoppingItems) {
            sum+=item.getTotalPrice();
        }
        return sum;
    }
}
