class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas=0;
        int sumCost=0;
        for(int i:gas){
            sumGas+=i;
        }
        for(int i:cost){
            sumCost+=i;
        }
        if(sumGas<sumCost){
            return -1;
        }
        int start=0;
        int total=0;

        for(int i=0;i<cost.length;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                total=0;
                start=i+1;
            }
        }
        return start;
    }
}
