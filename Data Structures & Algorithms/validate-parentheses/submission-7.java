class Solution {
    public boolean isValid(String s) {
        ArrayList <String> list = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++){
            String current = s.substring(i, i + 1);
            if(current.equals("(") || current.equals("[") || current.equals("{")){
                list.add(current);
            }
            if (current.equals(")") || current.equals("]") || current.equals("}")) {
                if (list.isEmpty()) {
                    return false;
                }
            }
            if(current.equals(")")){
                if(!list.get(list.size()-1).equals("(")){
                    return false;
                }
                list.remove(list.size()-1);
            }
            if(current.equals("]")){
                if(!list.get(list.size()-1).equals("[")){
                    return false;
                }
                list.remove(list.size()-1);
            }
            if(current.equals("}")){
                if(!list.get(list.size()-1).equals("{")){
                    return false;
                }
                list.remove(list.size()-1);
            }   
        }
        return list.isEmpty();
    }
}
