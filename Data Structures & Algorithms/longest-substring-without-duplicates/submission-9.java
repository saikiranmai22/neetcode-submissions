class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> set = new HashMap<>();
        int left=0;
        int maxL=0;
        for(int i=0;i<s.length();i++){
            
            if(set.containsKey(s.charAt(i))){
                left=Math.max(left,set.get(s.charAt(i))+1);
            }
            maxL=Math.max(maxL, i-left+1);
            set.put(s.charAt(i),i);
        }
        return maxL;
    }
}
