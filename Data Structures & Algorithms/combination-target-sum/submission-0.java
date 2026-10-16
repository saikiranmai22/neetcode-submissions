class Solution {
    List<List<Integer>> arr= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums, target, arr, new ArrayList<>(), 0);
        return arr;
    }

    public void backtrack(int nums[], int target, List<List<Integer>> arr, List<Integer> subset, int i){
        if(target==0 ){
            arr.add(new ArrayList<>(subset));
            return;
        }

        if(target<0 || i>nums.length-1) return;
        subset.add(nums[i]);
        backtrack(nums, target-nums[i], arr, subset, i);
        subset.remove(subset.size()-1);
        backtrack(nums, target, arr, subset, i+1);
    }
}
