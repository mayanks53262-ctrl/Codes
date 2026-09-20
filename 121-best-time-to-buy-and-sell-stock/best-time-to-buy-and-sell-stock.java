class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit=0;
        for(int day = 1;day<prices.length;day++){
            if(prices[day]<buyPrice){
                buyPrice=prices[day];
            }else if (prices[day]-buyPrice >profit){
                profit =prices[day] - buyPrice;
            }

        }
        return profit;
    }
}