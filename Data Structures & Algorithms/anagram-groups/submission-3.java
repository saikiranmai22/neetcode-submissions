class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String> ans = new ArrayList<>();
        HashMap<String,List<String>> hash=new HashMap<>();

        for(String s:strs){
            int freq[]= new int[26];
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
            String pattern= Arrays.toString(freq);
            hash.putIfAbsent(pattern,new ArrayList<>());
            hash.get(pattern).add(s);
        }
    return new ArrayList<>(hash.values());
    }
}
