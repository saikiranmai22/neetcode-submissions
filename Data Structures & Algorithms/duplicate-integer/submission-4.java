class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i:nums){
            if(hash.contains(i)){
                return true;
            }
            hash.add(i);
        }
        return false;
    }
}