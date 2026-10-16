class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash= new HashMap<>();

        for(String str:strs){
            int count[]= new int[26];

            for(char i:str.toCharArray()){
                count[i-'a']++;
            }
            String k= Arrays.toString(count);
            hash.putIfAbsent(k, new ArrayList<>());
            hash.get(k).add(str);
        }
        return new ArrayList<>(hash.values());
    }
}
