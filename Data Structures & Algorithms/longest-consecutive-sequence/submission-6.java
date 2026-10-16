class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i:nums){
            hash.add(i);
        }
        int length=0;

        for(int i:hash){
            if(!hash.contains(i-1)){
                int l=1;
                int n=i+1;
                while(hash.contains(n)){
                    n++;
                    l++;
                }
                length=Math.max(length, l);
            }
        }
        return length;
    }
}
