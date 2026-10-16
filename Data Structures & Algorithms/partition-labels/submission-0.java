class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int last[]= new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }

        ArrayList<Integer> ans= new ArrayList<>();
        int end=0;
        int length=0;
        for(int i=0;i<s.length();i++){
            end= Math.max(end,last[s.charAt(i)-'a']);
            length++;
            if(i==end){
                ans.add(length);
                length=0;
            }
        }
        return ans;
    }
}
