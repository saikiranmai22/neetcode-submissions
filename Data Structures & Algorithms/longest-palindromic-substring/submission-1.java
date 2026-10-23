class Solution {
    public String longestPalindrome(String s) {
        int start=0; //we need them to get the substring
        int end=0;
        for(int i=0;i<s.length();i++){
            int l1=expand(s,i,i);
            int l2=expand(s,i,i+1);
            int l=Math.max(l1,l2);
            if(l>end-start+1){ 
                start=i-(l-1)/2; //if even palindrome ,the left side is shorter
                end=i+l/2;
            }
        }
        return s.substring(start,end+1);
    }

    public int expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left+1-2;
    }
}
