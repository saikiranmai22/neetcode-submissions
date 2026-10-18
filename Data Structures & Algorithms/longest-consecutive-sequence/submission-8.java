class Solution {
    public int longestConsecutive(int[] nums) {
        int length=0;
        HashSet<Integer> set= new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        
        for(int i:nums){
            if(!set.contains(i-1)){
                boolean cons=true;
            int l=0;
            while(cons){
                if(!set.contains(i+1)){
                    cons=false;
                }
                i++;
                l++;
            }
            length=Math.max(length,l);
            }
        }
        return length;
    }
}