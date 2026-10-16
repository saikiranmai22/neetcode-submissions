class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right= heights.length-1;
        int maxArea=0;

        while(left<right){
            int minh= Math.min(heights[left],heights[right]);
            int area= minh*(right-left);
            maxArea= Math.max(area,maxArea);

            if(heights[left]<=heights[right]){
                while(left<right && heights[left]<=minh){
                    left++;
                }
            }else{
                while(left<right && heights[right]<=minh){
                    right--;
                }
            }
        }
        return maxArea;
    }
}
