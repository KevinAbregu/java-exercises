package com.timbuchalka2;

import java.util.Map;

public class Challenge {
    private static final StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp = new StockItem("cake",1.10,7);
        stockList.addStock(temp);

        temp = new StockItem("car",12.50,2);
        stockList.addStock(temp);

        temp = new StockItem("chair",62.0,10);
        stockList.addStock(temp);

        temp = new StockItem("cup",0.50,200);
        stockList.addStock(temp);
        temp = new StockItem("cup",0.45,7);
        stockList.addStock(temp);

        temp = new StockItem("door",72.95,4);
        stockList.addStock(temp);

        temp = new StockItem("juice",2.50,36);
        stockList.addStock(temp);

        temp = new StockItem("phone",96.99,35);
        stockList.addStock(temp);

        temp = new StockItem("towel",2.40,80);
        stockList.addStock(temp);

        temp = new StockItem("vase",8.76,40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "car",1,true);
        System.out.println(timsBasket);
        sellItem(timsBasket,"car",1,true);
        System.out.println(timsBasket);
        sellItem(timsBasket,"car",1,true);
        sellItem(timsBasket,"spanner",5,true);
        System.out.println(timsBasket);

        sellItem(timsBasket,"juice",4,true);
        sellItem(timsBasket,"cup",12,true);
        sellItem(timsBasket,"bread",1,true);
        System.out.println(timsBasket);
        System.out.println(stockList);

        for(Map.Entry<String,Double> price: stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs " + String.format("%.2f",price.getValue()));
        }
        sellItem(timsBasket, "car",1,true);
        sellItem(timsBasket, "car",1,false);
        System.out.println(timsBasket);

        Basket basket = new Basket("customer");

        sellItem(basket,"cup",100,true);
        sellItem(basket,"juice",5,true);
        sellItem(basket,"cup",1,true);

        sellItem(timsBasket, "car",1,false);
        sellItem(timsBasket,"cup",9,false);
        sellItem(basket,"cup",1,false);
        System.out.println(timsBasket);
        System.out.println(basket);
        System.out.println(stockList);
        basket.checkOut();
        System.out.println(stockList);
        timsBasket.checkOut();
        System.out.println(stockList);

//        timsBasket.checkOut();
//        System.out.println(stockList);
//        System.out.println(timsBasket);

    }
    public static int sellItem(Basket basket, String item, int quantity, boolean reserved){
        //retrieve the time from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item,quantity,reserved) != 0){

            if(basket.addToBasket(stockItem,quantity, reserved) != -1){
                return quantity;
            }
            stockList.sellStock(item,quantity,!reserved);
        }
        System.out.println("There are no more: " + item);
        return 0;
    }
}
