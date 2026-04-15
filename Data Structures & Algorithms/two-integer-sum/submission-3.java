class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hashMap = new HashMap<>();
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], i);
            }
          
            if(hashMap.containsKey(diff)){
                answer[0] = hashMap.get(diff);
                answer[1] = i;
            }
        }
        return answer;
    }
}

// take a value of the array as a key
// does any other key exist that matches with the target (target - nums[i])
// return values of the two