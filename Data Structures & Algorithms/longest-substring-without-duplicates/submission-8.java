class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxl=0;
        HashMap<Character, Integer> hash= new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                left= Math.max(left, hash.get(s.charAt(i))+1);
                
            }
            hash.put(s.charAt(i),i);   
            maxl=Math.max(maxl, i-left+1);
        }
        return maxl;
    }
}
