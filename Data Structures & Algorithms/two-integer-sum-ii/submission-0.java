class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int front = 0;
        int back = numbers.length - 1;
        int ans[] = new int[2];
        while(front < back){
            int sum = numbers[front] + numbers[back];
            if(sum == target){
                ans[0] = front + 1;
                ans[1] = back + 1;
                return ans;
            } else if(sum > target){
                back--;
            } else{
                front++;
            }
        }
        return ans;
    }
}
