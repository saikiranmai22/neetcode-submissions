class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character,Integer> freq= new HashMap<>();
        Map<Character,Integer> window= new HashMap<>();
        for(char c: t.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        int res[]={-1,-1};
        int len=Integer.MAX_VALUE;
        int have=0;
        int need=freq.size();//there r no duplicates?
        // int need= t.length(); // this wrong because , 'have' is inc only if the freq is satisfied
        int left=0;

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            window.put(c,window.getOrDefault(c,0)+1);

            if(freq.containsKey(c) && window.get(c).equals(freq.get(c))){
                have++;
            }

            while(have==need){
                if((i-left+1)<len){
                    len=i-left+1;
                    res[0]=left;
                    res[1]=i;
                }

                char leftChar= s.charAt(left);
                window.put(leftChar, window.get(leftChar)-1);
                if(freq.containsKey(leftChar) && window.get(leftChar)<freq.get(leftChar)){
                    have--; //if the letter is part of t 
                }
                left++; //till we remove the first occuring character part of t string , then it exists  
            }
        }
        return len==Integer.MAX_VALUE? "": s.substring(res[0],res[1]+1);
    }
}