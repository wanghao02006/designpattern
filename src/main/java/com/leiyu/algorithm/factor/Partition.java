package com.leiyu.algorithm.factor;

/**
 * Created by wh on 2017/4/25.
 */
public class Partition {

    public static void main(String[] args) {
        GoldCoin[] coins = new GoldCoin[50];
        for(int i = 0 ; i < 50 ; i++){
            GoldCoin coin = new GoldCoin(10);
            if(i == 10){
                coin.setWeight(9);
            }
            coins[i] = coin;
        }

        GoldCoin result = new Partition().findphoney(coins,0,coins.length);
        System.out.println(result);
    }

    private GoldCoin findphoney(GoldCoin[] coins,int start,int end){
        if(coins.length == 2){
            if(coins[0].getWeight() > coins[1].getWeight()){
                return coins[1];
            }else if(coins[0].getWeight() < coins[1].getWeight()){
                return coins[0];
            }else {
                return null;
            }
        }else{
            if((start + end ) % 2 == 0){
                int half = (start + end) / 2;
                double headweight = getWeights(coins,start,half);
                double tailweight = getWeights(coins,half,end);
                if(headweight == tailweight){
                    return null;
                }else if(headweight > tailweight){
                    return findphoney(coins,half,end);
                }else{
                    return findphoney(coins,start,half);
                }
            }else{
                int half = (start + end) / 2;
                double headweight = getWeights(coins,start,half);
                double tailweight = getWeights(coins,half,end-1);
                if(headweight == tailweight){
                    GoldCoin coin = coins[start];
                    if(coin.getWeight() > coins[end].getWeight()){
                        return coins[end];
                    }else if(coin.getWeight() < coins[end].getWeight()){
                        return coin;
                    }else {
                        return null;
                    }
                }else if(headweight > tailweight){
                    return findphoney(coins,half,end-1);
                }else{
                    return findphoney(coins,start,half);
                }
            }
        }
    }

    /**
     * 获取所有质量
     * @param coins
     * @param start
     * @param end
     * @return
     */
    private double getWeights(GoldCoin[] coins,int start,int end){
        double weight = 0.0;
        for(int i = start; i < end ; i++){
            weight += coins[i].getWeight();
        }
        return weight;
    }

    private static class GoldCoin{
        private double weight;

        public GoldCoin(double weight) {
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "GoldCoin{" +
                    "weight=" + weight +
                    '}';
        }
    }
}
