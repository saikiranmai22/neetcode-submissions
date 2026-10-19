class Solution {
    public int characterReplacement(String s, int k) {
        int maxl=0;
        int currMaxFreq=0;
        int left=0;
        int freq[]=new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            currMaxFreq=Math.max(currMaxFreq,freq[s.charAt(i)-'A']);

            if((i-left+1)-currMaxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxl=Math.max(maxl,i-left+1);
        }
        return maxl;
    }
}
