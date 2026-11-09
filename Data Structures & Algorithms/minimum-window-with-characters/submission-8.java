class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> hash= new HashMap<>();
        for(char c: t.toCharArray()){
            hash.put(c,hash.getOrDefault(c,0)+1);
        }

        int have=0;
        int need=hash.size();
        int res[]={-1,-1};
        int len=Integer.MAX_VALUE;
        int l=0;
        HashMap<Character,Integer> window= new HashMap<>();
        for(int r=0;r<s.length();r++){
            
            char c= s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            
            if(hash.containsKey(c) && hash.get(c).equals(window.get(c))){
                have++;
            }

            while(have==need){
                if((r-l+1)<len){
                    res[0]=l;
                    res[1]=r;
                    len=r-l+1;
                }
                char lc=s.charAt(l);
                window.put(lc,window.get(lc)-1);
                if(hash.containsKey(lc) && window.get(lc)<hash.get(lc)){
                    have--;
                }
                l++;
            }

        }

        return len==Integer.MAX_VALUE ? "":s.substring(res[0],res[1]+1);
    }
}
