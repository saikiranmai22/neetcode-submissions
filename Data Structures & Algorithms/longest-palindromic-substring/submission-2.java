class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start=0; 
        int end=0;
        int maxl=0;
        for(int i=0;i<n;i++){
            int l1=dp(i,i,s);//odd
            int l2=dp(i,i+1,s);//even
            int l=Math.max(l1,l2);
            if(l>maxl){
                start=i-(l-1)/2;
                end=i+l/2;
                maxl=l;
            }
        }
        return s.substring(start,end+1);
    }

    public int dp(int left, int right,String s){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        left++;
        right--;
        return right-left+1;
    }
}
