class Solution {
    public int maxProfit(int[] prices) {
        int l = 0; int r = 1; int result = 0;
        while(l < r && r < prices.length) {
            if(prices[l] > prices[r]) {
                l = r;
                r++;
            } else {
                result = Math.max(result, prices[r] - prices[l]);
                r++;
            }
        }
        return result;
    }
}
