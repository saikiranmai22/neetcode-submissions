class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hashs1= new HashMap<>();
        for(char c: s1.toCharArray()){
            hashs1.put(c,hashs1.getOrDefault(c,0)+1);
        }
        int need=hashs1.size();
        int have=0;
        int l=0;
        HashMap<Character,Integer> window= new HashMap<>();

        for(int r=0;r<s2.length();r++){
            char c= s2.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);

            if(hashs1.containsKey(c) && hashs1.get(c)==window.get(c)){
                have++;
                
            }

            if((r-l+1)>s1.length()){
                char lc=s2.charAt(l);
                
                if(hashs1.containsKey(lc) && window.get(lc).equals( hashs1.get(lc) )){
                    have--;
                }
                window.put(lc,window.get(lc)-1);
                l++;
            }

            if(have==need){
                return true;
            }
        }
        return false;
    }
}
