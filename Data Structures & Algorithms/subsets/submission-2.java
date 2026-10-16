class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>()); 
        int n = nums.length;
        for(int i= 0;i<n;i++){
            int a= nums[i];
            List<List<Integer>> temp = new ArrayList<>();

            for(List<Integer> sub:answer){
                List<Integer> newSub= new ArrayList<>(sub);
                newSub.add(a);
                temp.add(newSub);
            }
            answer.addAll(temp);
        }
        return answer;
    }
}