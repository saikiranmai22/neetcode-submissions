class Solution {
    List<List<Integer>> arr = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        backtrack( arr,new ArrayList<>(),nums,0);
        return arr;
    }

    public void backtrack(List<List<Integer>> arr, List<Integer> subset, int nums[], int i){
        if(i>=nums.length){
            arr.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        backtrack(arr,subset, nums, i+1);
        subset.remove(subset.size()-1);
        backtrack(arr,subset, nums, i+1);
    }
}
