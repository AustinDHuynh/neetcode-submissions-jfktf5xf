class Solution {
    public boolean isValid(String s) {
        Stack <String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            String current = s.substring(i, i + 1);
            if(current.equals("(") || current.equals("[") || current.equals("{")){
                stack.push(current);
            } 
            if (current.equals(")") || current.equals("]") || current.equals("}")) {
                if (stack.isEmpty()) {
                    return false;
                }
            }
            if(current.equals(")")){
                if(!stack.peek().equals("(")){
                    return false;
                }
                stack.pop();
            }
            if(current.equals("}")){
                if(!stack.peek().equals("{")){
                    return false;
                }
                stack.pop();
            }
            if(current.equals("]")){
                if(!stack.peek().equals("[")){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
