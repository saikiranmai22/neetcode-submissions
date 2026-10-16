class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(set.containsKey(n)){
                return new int[]{set.get(n),i};
            }
            set.put(nums[i],i);
        }
        return new int[]{};
    }
}
