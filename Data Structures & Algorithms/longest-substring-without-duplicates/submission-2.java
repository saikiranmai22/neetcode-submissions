class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hash= new HashMap<>();
        int left=0;
        int maxLen=0;

        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                left=Math.max(left,hash.get(s.charAt(i))+1); // move the left pointer after the occurence of the duplicate letter , the letter next to it
            }
            hash.put(s.charAt(i),i);
            maxLen= Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
}
