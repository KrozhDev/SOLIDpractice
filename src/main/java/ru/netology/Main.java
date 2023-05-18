package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BotManager bm = new BotManager();

        Market.addToMarket("Хлеб", 56);
        Market.addToMarket("Масло", 153);
        Market.addToMarket("Колбаса", 211);
        Market.addToMarket("Пирожок", 45);


        Market.getMarketList();

        bm.setOrder();

        bm.printSum();

    }
}
