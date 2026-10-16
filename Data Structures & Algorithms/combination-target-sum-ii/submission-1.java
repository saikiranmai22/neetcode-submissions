class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr= new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(arr, new ArrayList<>(), candidates, target, 0);
        return arr;
    }

    public void backtrack(List<List<Integer>> arr, List<Integer> subset, int candidates[], int target, int i){
        if(target==0){
            arr.add(new ArrayList<>(subset));
            return;
        }

        if(target<0 || i>candidates.length-1) return;

        subset.add(candidates[i]);
        backtrack(arr,subset,candidates, target-candidates[i],i+1);

        while(i<candidates.length-1 && candidates[i]==candidates[i+1]) i++;
        subset.remove(subset.size()-1);
        backtrack(arr,subset, candidates, target,i+1);
    }
}
