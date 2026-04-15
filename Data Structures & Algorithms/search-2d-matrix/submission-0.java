class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0;
        int bot = ROWS -1;
        while(top <= bot){
            int row = (top + bot)/2;
            if(matrix[row][COLS - 1] < target){
                top = row + 1;
            } else if(matrix[row][0] > target){
                bot = row - 1;
            } else{
                break;
            }
        }
        if(!(top <= bot)){
            return false;
        }
        int row = (top + bot)/2;
        int low = 0;
        int high = COLS - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(matrix[row][mid] > target){
                high = mid - 1;
            } else if(matrix[row][mid] < target){
                low = mid + 1;
            } else{
                return true;
            }
        }
        return false;
    }
}
