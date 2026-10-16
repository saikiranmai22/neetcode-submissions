class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftmost=0;
        int maxLength=0;

        HashMap<Character,Integer> hash= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                leftmost=Math.max(leftmost, hash.get(s.charAt(i))+1);
            }
            hash.put(s.charAt(i),i);
            maxLength= Math.max(maxLength, i-leftmost+1);
        }
        return maxLength;
    }
}
