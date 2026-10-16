class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length-1;
        int res=0;

        while(left<right){
            int minh =Math.min(heights[left], heights[right]);
            int area= minh* (right-left);
            res=Math.max(area,res);

            if(heights[left]<heights[right]){
                while(left<=right && heights[left]<=minh){
                    left++;
                }
            }else{
                while(left<=right && heights[right]<=minh){
                    right--;
                }
            }
        }
        return res;
    }
}
