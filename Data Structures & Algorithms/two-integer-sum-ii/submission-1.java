class Solution {
    public int[] twoSum(int[] numbers, int target) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    int[] res = new int[2];
    for(int i = 0; i < numbers.length; i++){
        int temp = target - numbers[i];
        if(hm.containsKey(temp)){
            res[0] = hm.get(temp);
            res[1] = i+1;
        }
        hm.put(numbers[i], i + 1);
    }
    return res;
    }
}
