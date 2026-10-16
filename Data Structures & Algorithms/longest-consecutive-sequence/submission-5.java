class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash= new HashSet<>();
        for(int i:nums){
            hash.add(i);
        }
        
        int maxl=0;
        
        for(int i:hash){
            if(!hash.contains(i-1)){//no number in between a sequence will be allowed
                int l=1;
                while(hash.contains(i+l)){ //loops
                    l++;
                }
                maxl=Math.max(l,maxl);
            }
        }
        return maxl;
    }
}
