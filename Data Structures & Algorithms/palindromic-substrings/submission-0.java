class Solution {
    public int countSubstrings(String s) {
        int count=0;

        for(int i=0;i<s.length();i++){
            int c1=dp(i,i,s);
            int c2=dp(i,i+1,s);
            count+=c1+c2-2;
        }
        return count;
    }

    public int dp(int left, int right, String s){
        int palindromes=1;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            palindromes++;
        }
        return palindromes;
    }
}