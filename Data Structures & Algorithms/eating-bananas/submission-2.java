class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=Arrays.stream(piles).max().getAsInt();
        int ans=max;

        while(min<=max){
            int k= min+(max-min)/2;
            int t=0;
            for(int i=0;i<piles.length;i++){
                t+=(piles[i]+k-1)/k;
            }

            if(t<=h){ //took less time
                ans= k;
                max=k-1;

            }else{ //took more time
                min=k+1;
            }
        }
        return ans;
    }
}
