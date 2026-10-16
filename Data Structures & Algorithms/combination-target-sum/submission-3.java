class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res=new ArrayList<>();
        backtrack(0,nums, target,new ArrayList<>(), 0);
        return res;
    }

    private void backtrack(int i, int nums[], int target, List<Integer> curr, int total){
        if(total==target){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(total>target || i==nums.length)return;

        curr.add(nums[i]);
        backtrack(i,nums,target,curr,total+nums[i]);
        curr.remove(curr.size()-1);
        backtrack(i+1,nums,target,curr,total);
    }
}
