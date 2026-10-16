class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hash = new HashMap<>();

        for(String s:strs){
            int count[]= new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            String pattern= Arrays.toString(count);
            hash.putIfAbsent(pattern, new ArrayList<>());
            hash.get(pattern).add(s);
        }

        return new ArrayList<>(hash.values());
    }
}
