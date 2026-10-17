class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i:nums){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> arr[]= new ArrayList[nums.length+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> n:hash.entrySet()){
            arr[n.getValue()].add(n.getKey());
        }

        int ans[]= new int[k];
        int index=0;
        for(int i=nums.length;i>=0;i--){
            for(int j:arr[i]){
                ans[index]=j;
                index++;
                if(index==k){
                    return ans;
                }
            }
        }
        return ans;
    }
}
