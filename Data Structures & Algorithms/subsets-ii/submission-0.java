class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr= new ArrayList<>();
        backtrack(nums, arr, new ArrayList<>(), 0);
        return arr;
    }

    private void backtrack(int nums[], List<List<Integer>> arr, List<Integer> sub, int index){
        if(index==nums.length){
            arr.add(new ArrayList<>(sub));
            return ;
        }

        sub.add(nums[index]);
        backtrack(nums, arr, sub, index+1);
        while(index<nums.length-1 && nums[index]==nums[index+1]) index++;
        sub.remove(sub.size()-1);
        backtrack(nums, arr, sub, index+1);
    }
}
