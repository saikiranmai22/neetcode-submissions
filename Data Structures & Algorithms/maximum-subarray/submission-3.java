class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int sum=0;
        for(int i:nums){
            if(sum<0){
                sum=0;
            }
            sum+=i;
            maxSum=Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
