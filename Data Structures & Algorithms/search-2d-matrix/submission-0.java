class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int Row=matrix.length; 
        int Col=matrix[0].length;

        int first=0;
        int last=Row*Col-1;

        while(first<=last){
            int m = first+(last-first)/2;
            int row=m/Col;
            int col=m%Col;

            if(matrix[row][col]>target){
                last=m-1;
                
            }else if(matrix[row][col]<target){
                first=m+1;
                
            }else{
                return true;
            }
        }
        return false;
    }
}
