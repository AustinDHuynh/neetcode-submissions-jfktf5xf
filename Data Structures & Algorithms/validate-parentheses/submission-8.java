class Solution {
    public boolean isValid(String s) {
         Stack<String> list = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            String current = s.substring(i, i + 1);
            if(current.equals("(") || current.equals("[") || current.equals("{")){
                list.push(current);
            }
            if (current.equals(")") || current.equals("]") || current.equals("}")) {
                if (list.isEmpty()) {
                    return false;
                }
            }
            if(current.equals(")")){
                if(!list.peek().equals("(")){
                    return false;
                }
                list.remove(list.size()-1);
            }
            if(current.equals("]")){
                if(!list.peek().equals("[")){
                    return false;
                }
                list.remove(list.size()-1);
            }
            if(current.equals("}")){
                if(!list.peek().equals("{")){
                    return false;
                }
                list.pop();
            }   
        }
        return list.isEmpty();
    }
}
