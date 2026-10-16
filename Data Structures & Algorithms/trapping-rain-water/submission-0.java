class Solution {
    public int trap(int[] height) {
        if(height==null || height.length ==0){
            return 0;
        }

        int left=0;
        int right=height.length-1;

        int area=0;
        int maxl=height[left];
        int maxr=height[right];

        while(left<right){
            
            if(maxl<maxr){
                left++;
                maxl=Math.max(maxl, height[left]);
                area+=maxl-height[left];

            }else{
                right--;
                maxr= Math.max(maxr, height[right]);
                area+=maxr- height[right];

            }   
        }
        return area;
    }
}
