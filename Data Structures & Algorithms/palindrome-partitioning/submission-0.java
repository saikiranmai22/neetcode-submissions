class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> arr= new ArrayList<>();
        Boolean dp[][]= new Boolean[s.length()][s.length()];
        backtrack(arr, s, dp,0,new ArrayList<>());
        return arr;
    }

    public void backtrack(List<List<String>> arr, String s, Boolean dp[][], int index, List<String> sub){
        if(index==s.length()){
            arr.add(new ArrayList<>(sub));
            return ;
        }
        
        for(int i=index; i<s.length();i++){
            if(palindrome( index, i,dp,s)){
                sub.add(s.substring(index,i+1));
                backtrack(arr, s, dp, i+1 , sub);
                sub.remove(sub.size()-1);
            }
        }
    }

    public boolean palindrome(int start, int end , Boolean dp[][], String s){
        if(dp[start][end]!=null) return dp[start][end];
        
        int i=start;
        int j= end;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return dp[i][j]=false;
            }
            start++;
            end--;
        }
        return dp[i][j]=true;
    }
}
