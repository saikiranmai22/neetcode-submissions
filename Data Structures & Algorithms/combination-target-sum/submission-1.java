class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res= new ArrayList<>();
        backtrack(0,nums,target,0,new ArrayList<>());
        return res;
    }

    private void backtrack(int i, int nums[], int target, int total, List<Integer> curr){
        if(total==target){
            res.add(new ArrayList<>(curr));
            return;// find one
        }
        if(total>target || i== nums.length) return;

        curr.add(nums[i]);
        backtrack(i,nums,target, total+nums[i],curr);
        curr.remove(curr.size()-1);
        backtrack(i+1,nums,target,total,curr);
    }
}
