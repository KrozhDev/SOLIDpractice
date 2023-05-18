package ru.netology;

import java.util.Scanner;

public class BotManager implements BotManagerInt {
    Scanner scanner = new Scanner(System.in);
    Purchase purchase = new Purchase();

    PurchaseService purchaseService = new PurchaseService(purchase);

    @Override
    public void setOrder() {

        System.out.println("Введите два слова: название товара и количество. Или end");

        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);


            purchaseService.addPurchase(product, count);


        }
    }

    public void printSum() {
        long sum = purchaseService.sum(Market.getProducts());
        System.out.println("ИТОГО: " + sum);
    }



}
