class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res=new ArrayList<>();
        backtrack(0,nums,target,new ArrayList<>(),0);
        return res;
    }

    private void backtrack(int i, int nums[], int target, ArrayList<Integer> ans, int total){

        if(total==target){
            res.add(new ArrayList<>(ans));
            return;
        }

        if(total>target || i==nums.length) return;

        ans.add(nums[i]);
        backtrack(i,nums,target,ans,total+nums[i]);
        ans.remove(ans.size()-1);
        backtrack(i+1,nums,target,ans,total);
    }
}
