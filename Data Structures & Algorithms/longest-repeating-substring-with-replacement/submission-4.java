class Solution {
    public int characterReplacement(String s, int k) {
        int length=0;
        int left=0;
        int mostfreq=0;
        int freq[]= new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            mostfreq=Math.max(mostfreq, freq[s.charAt(i)-'A']);

            if((i-left+1)-mostfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            length=Math.max(length, i-left+1);
        }
        return length;
    }
}
