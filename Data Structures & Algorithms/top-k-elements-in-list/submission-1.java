class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash= new HashMap<>();

        for(int i:nums){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }

        List<Integer> freq[]= new List[nums.length+1];

        for(int i=0;i<nums.length+1;i++){
            freq[i]= new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry: hash.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int ans[]= new int[k];
        int index=0;
        for(int i=nums.length;i>0 && index<k ;i--){
            for(int y:freq[i]){
                ans[index]=y;
                index++;
            }
        }
        return ans;
    }
}
