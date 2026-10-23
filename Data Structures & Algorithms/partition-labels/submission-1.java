class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hash= new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            hash.put(s.charAt(i),i);
        }
        int length=0;
        int last=0;
        for(int i=0;i<s.length();i++){
            length++;
            last=Math.max(hash.get(s.charAt(i)),last);
            if( i==last){
                ans.add(length);
                length=0;
            }
        }
        return ans;
    }
}
