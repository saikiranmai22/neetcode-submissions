class Solution {
    public boolean isAnagram(String s, String t) {
        int count[]= new int[26];
        for(int i:s.toCharArray()){
            count[i-'a']++;
        }
        for(int i:t.toCharArray()){
            count[i-'a']--;
        }
        for(int i:count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
