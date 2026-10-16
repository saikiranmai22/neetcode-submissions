class Solution {
    public String longestPalindrome(String s) {
        int start=0,end=0;

        for(int i=0;i<s.length();i++){
            int l1= expandFromMiddle(s,i,i);
            int l2= expandFromMiddle(s,i,i+1);
            int l=Math.max(l1,l2);
            if(l>end-start){
                start=i-(l-1)/2;
                end=i+l/2;
            }
        }
        return s.substring(start,end+1);
    }

    private int expandFromMiddle(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-1 - (left+1)+1;
    }
}
