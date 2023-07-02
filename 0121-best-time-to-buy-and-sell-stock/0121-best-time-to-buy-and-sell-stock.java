class Solution {
    public int maxProfit(int[] prices) {
        int min = 10000;
        
  
        int maxDiff = 0;
        
        int size = prices.length;
        
        for (int i = 0; i < size; i++){
            min = Math.min(prices[i], min);

            maxDiff = Math.max(prices[i] - min, maxDiff);
         }
        return maxDiff;
    }
}