class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visit = new HashSet<>();
        while(!visit.contains(n)){
            visit.add(n);
            n = SumOfSquare(n);
            if(n == 1){
                return true;
            }
        }
        return false;
    }
    private int SumOfSquare(int n){
        int output = 0;
        while(n > 0){
            int digit = n % 10;
            digit = digit * digit;
            output += digit;
            n /= 10;
        }
        return output;
    }
}
