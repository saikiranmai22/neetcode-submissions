class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        for(String string:strs){
            int count[]= new int[26];
            for(int s:string.toCharArray()){
                count[s-'a']++;
            }
            String freq= Arrays.toString(count);
            hash.putIfAbsent(freq,new ArrayList<>());
            hash.get(freq).add(string);
        }
        return new ArrayList<>(hash.values());
    }
}
