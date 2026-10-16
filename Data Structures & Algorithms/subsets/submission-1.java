class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>()); // as the list is empty it wont traverse
        int n = nums.length;
        for(int i= 0;i<n;i++){//traverse through the array given in the question 
            int a= nums[i];
            List<List<Integer>> temp = new ArrayList<>();//as the current array gets modified

            for(List<Integer> sub:answer){//traverse through answer
                //take each int from the given array one by one and then 
                //include in all the arrays present in the answer array and then dont include
                //or just add new arrays that have the new number in the array
                List<Integer> newSub= new ArrayList<>(sub);
                newSub.add(a);
                temp.add(newSub);
            }
            for(List<Integer> sub:temp){
                answer.add(sub);
            }
        }
        return answer;
    }
}