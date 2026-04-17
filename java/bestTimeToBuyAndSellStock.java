class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int bestSale = prices[0];

        int maxProfit = 0;


        for (int i = 0; i < prices.length; i++) {
            // if current price is less than the best buy
            // set the best buy and best sale to the new number

            if(prices[i] < bestBuy) {
                bestBuy = prices[i];
                bestSale = prices[i];
            }

            if (prices[i] > bestSale) {
                bestSale = prices[i];
            }

            if ((bestSale - bestBuy) > maxProfit) {
                maxProfit = bestSale - bestBuy;
            }
        }

        return maxProfit;
    }
}