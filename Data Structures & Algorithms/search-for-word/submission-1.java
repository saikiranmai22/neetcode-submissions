class Solution {
    int row, col;
    public boolean exist(char[][] board, String word) {
        row= board.length;
        col= board[0].length;

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(backtrack(r,c, board, word,0)){
                    return true; // if true ends , if false continues
                }
            }
        }
        return false;
    }

    public boolean backtrack(int r, int c,char[][] board, String word, int i){
        if(i==word.length()){
            return true; // to end it
        }

        if(r<0 || c<0 ||r>=row ||c>=col||board[r][c]!=word.charAt(i)) return false;

        char temp= board[r][c];
        board[r][c]='#';
        boolean a= backtrack(r+1,c, board, word,i+1) ||
                    backtrack(r-1,c, board, word,i+1) ||
                    backtrack(r,c+1, board, word,i+1) ||
                    backtrack(r,c-1, board, word,i+1);
        board[r][c]=temp;
        return a;
    }
}
