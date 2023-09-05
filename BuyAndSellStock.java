public class BuyAndSellStock {
    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    public int maxProfit(int[] prices) {
        int buyIndex = 0;
        int sellIndex = 1;
        int maxProfit = 0;
        int i = 1;
        while(i < prices.length){
            if(prices[i] <= prices[buyIndex]){
                buyIndex = i;
                sellIndex = i;
            } else if(prices[i] >= prices[sellIndex]){
                sellIndex = i;
            }
            if(sellIndex > buyIndex)
                maxProfit = Math.max(maxProfit, prices[sellIndex] - prices[buyIndex]);
            i++;
        }
        return maxProfit;
    }
}
