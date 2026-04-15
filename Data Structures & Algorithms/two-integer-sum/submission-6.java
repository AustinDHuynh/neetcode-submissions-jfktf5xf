class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int answer[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i]; 
            if(!hashmap.containsKey(complement)){
                hashmap.put(nums[i], i);
            }

            if(hashmap.containsKey(complement)){
                answer[0] = hashmap.get(complement);
                answer[1] = i;
            }
        }
        return answer;
    }
}
