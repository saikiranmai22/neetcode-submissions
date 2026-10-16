class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count= new HashMap<>();
        for(int i:nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }

        List<Integer> freq[]= new ArrayList[nums.length+1];

        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> i: count.entrySet()){
            freq[i.getValue()].add(i.getKey());
        }

        int ans[]= new int[k];
        int m=0;
        for(int i=freq.length-1;i>0 && m<k;i--){
            for(int x:freq[i]){ // every number in the array
                ans[m]=x;
                m++;
                if(m==k){
                    return ans;
                }
            }
        }
        return ans;
    }
}
