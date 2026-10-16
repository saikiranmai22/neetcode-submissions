class Solution {
    public int binary(int l, int r, int[] nums, int target){
        int m= l+(r-l)/2;
        if(nums[m]==target){
            return m;
        }
        while(l<r){
            return (nums[m]>target)? binary(l,m-1,nums,target) :binary(m+1,r, nums,target);
        }
    return -1;
    }
    public int search(int[] nums, int target) {
        return binary(0, nums.length-1, nums,target);
    }
}
