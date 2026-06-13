class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        helper(nums,res,l,i,n);
        return res;
    }
    private void helper(int[] nums,List<List<Integer>> res,List<Integer> l,int i,int n){
        if(i==n){
            res.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        helper(nums,res,l,i+1,n);
        l.remove(l.size()-1);
        helper(nums,res,l,i+1,n);
        

        
    }
}
