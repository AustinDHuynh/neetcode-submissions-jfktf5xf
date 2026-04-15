class Solution {
    public boolean isPalindrome(String s) {
        int front = 0;
        int back = s.length() - 1;
        while(front < back){
            while(front < back && !Character.isLetterOrDigit(s.charAt(front))){
                front++;
            }
            while(front < back && !Character.isLetterOrDigit(s.charAt(back))){
                back--;
            }
            s = s.toLowerCase();
            if(s.charAt(front) != s.charAt(back)){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
