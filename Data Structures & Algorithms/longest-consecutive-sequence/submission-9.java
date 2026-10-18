class Solution {
    public int longestConsecutive(int[] nums) {
        int length=0;
        HashSet<Integer> set= new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        
        for(int i:nums){
            if(!set.contains(i-1)){
                int l=1;
                while(set.contains(i+1)){
                    l++;
                    i++;
                }
                length=Math.max(length, l);
            }
        }
        return length;
    }
}