class Solution {
    public int maxSubArray(int[] nums) {
        int s=0;
        int sum=nums[0];
        for(int i:nums){
            if(s<0){
                s=0;
            }
            s+=i;
            sum=Math.max(s,sum);
        }
        return sum;
    }
}
