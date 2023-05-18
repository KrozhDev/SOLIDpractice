package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class Market {

    private static HashMap<String, Integer> products = new HashMap<>();

    public static void addToMarket(String productName, Integer productPrice) {
        if (productPrice <= 0) {
            throw new IllegalArgumentException("Цена должна быть больше нуля");
        }
        products.put(productName,productPrice);
    }

    public static void getMarketList() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }

    public static HashMap<String, Integer> getProducts() {
        return products;
    }




}
