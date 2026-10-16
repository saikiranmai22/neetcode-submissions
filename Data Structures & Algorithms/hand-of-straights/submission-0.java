class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int l=hand.length;

        Map<Integer,Integer> hash= new HashMap<>();
        for(int i:hand){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> heap=new PriorityQueue<>(hash.keySet());
        while(!heap.isEmpty()){
            int start= heap.peek();
            for(int i=start;i<start+groupSize;i++){
                if(!hash.containsKey(i))return false;
                hash.put(i,hash.get(i)-1);
                if(hash.get(i)==0){
                     heap.poll();
                }
            }
        }
        return true;
    }
}
