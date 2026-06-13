class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int price = prices[0];
        for(int n: prices){
            if(n<price) price = n;
            if(n>price){
                ans = Math.max(ans,n-price);
            }

        }
        return ans;
    }
}
