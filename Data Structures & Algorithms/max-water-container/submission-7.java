class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxArea=0;
        while(left<right){
            int minH=Math.min(heights[left],heights[right]);
            int l=right-left;
            maxArea=Math.max(maxArea,l*minH);

            if(heights[left]<=heights[right]){
                while(left<right && heights[left]<=minH){
                    left++;
                }
            }else{
                while(left<right && heights[right]<=minH){
                    right--;
                }
            }
        }
        return maxArea;
    }
}
