class Solution {
    public int maxArea(int[] heights) {
        int front = 0;
        int back = heights.length - 1;
        int maxWater = 0;
        int curWater = 0;
        while(front < back){
            curWater = (back - front) * Math.min(heights[front], heights[back]);
            if(curWater > maxWater){
                maxWater = curWater;
            }
            if(heights[front] > heights[back]){
                back--;
            }else{
                front++;
            }
        }
        return maxWater;
    }
}
