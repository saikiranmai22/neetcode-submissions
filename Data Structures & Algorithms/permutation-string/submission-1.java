class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length() || s2.length()==0){
            return false;
        }
        int count1[]= new int[26];
        int count2[]= new int[26];

        for(int i=0;i<s1.length();i++){
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
        }
        int matches=0;
        for(int i=0;i<26;i++){
            if(count1[i]==count2[i])matches++;
        }

        for(int i=s1.length();i<s2.length();i++){
            if(matches==26){
                return true;
            }

            int right=s2.charAt(i)-'a';
            int left=s2.charAt(i-s1.length())-'a';

            count2[right]++;
            if(count2[right]==count1[right]) matches++;
            else if(count2[right]-1==count1[right])matches--;

            count2[left]--;
            if(count2[left]==count1[left])matches++;
            else if(count2[left]+1==count1[left])matches--;

        }
        return matches==26;
    }
}
