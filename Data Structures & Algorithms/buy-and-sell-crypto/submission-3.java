class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i:prices){
            if(buy>i){
                buy=i;
            }
            int p=i-buy;
            if(p>profit){
                profit=p;
            }
        }
        return profit;
    }
}
