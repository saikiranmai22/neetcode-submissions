class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums, target, 0, 0, new ArrayList<>());
        return ans;
    }

    public void backtrack(int nums[], int target, int i, int sum, List<Integer> combo){

        if(sum==target){
            ans.add(new ArrayList<>(combo));
            return;
        }

        if(sum>target || i>nums.length-1){return;}

        combo.add(nums[i]);
        backtrack(nums, target,i,sum+nums[i],combo);
        combo.remove(combo.size()-1);
        backtrack(nums, target,i+1,sum,combo);
    }
}
