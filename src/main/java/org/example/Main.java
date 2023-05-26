package org.example;

public class Main {
    public static void main(String[] args) {

       int  prices[] = {7,1,5,3,6,4};
       int min_price = Integer.MAX_VALUE;
       int maxProfit = 0;

       for(int i=0;i<prices.length;i++){
           if(prices[i]<min_price){
               min_price = prices[i];
           }
           else if(prices[i]-min_price>maxProfit){
               maxProfit = prices[i]-min_price;
           }

       }
       System.out.println(maxProfit);
    }
}