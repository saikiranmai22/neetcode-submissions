class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int max=0;
        while(left<right){
            int min=Math.min(heights[left],heights[right]);
            int length=right-left;
            max=Math.max(max,min*length);

            if(heights[left]<=heights[right]){
                while(left<right && heights[left]<=min){
                    left++;
                }
            }else{
                while(left<right && heights[right]<=min){
                    right--;
                }
            }     
        }
        return max;
    }
}
