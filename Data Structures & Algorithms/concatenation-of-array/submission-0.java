class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(i<nums.length){
                ans[i] = nums[i];
            }else{
                ans[i] = nums[i-nums.length];
            }
        }
        return ans;
    }
}