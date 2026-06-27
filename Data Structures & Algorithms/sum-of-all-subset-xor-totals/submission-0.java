class Solution {
    int res = 0;
    public int subsetXORSum(int[] nums) {
        return helper(0,nums,res);
    }
    public int helper(int i,int[] nums,int res){
        if(i==nums.length) return res;
        return helper(i+1,nums,res^nums[i])+helper(i+1,nums,res);
    }
}