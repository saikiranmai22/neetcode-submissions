class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr= new ArrayList<>();
        boolean check[]= new boolean[nums.length];
        backtrack(nums, arr, new ArrayList<>(), check);
        return arr;
    }

    private void backtrack(int nums[],List<List<Integer>> arr, List<Integer> sub, boolean check[]){
        if(sub.size()==nums.length){
            arr.add(new ArrayList<>(sub));
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(check[i]) continue;
            check[i]=true;
            sub.add(nums[i]);
            backtrack(nums, arr, sub, check);
            sub.remove(sub.size()-1);
            check[i]=false;
        }
    }
}
