package ru.netology;

import java.util.Map;

public class PurchaseService {

    private static final int PURCHASES_COUNT = 4;
    protected static Purchase[] purchases = new Purchase[PURCHASES_COUNT];

    private Purchase purchase;

    public PurchaseService(Purchase purchase){
        this.purchase = purchase;
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }
}
