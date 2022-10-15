import java.util.ArrayList;

class Solution {
    public boolean isValid(String s) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case '(':
                    list.add("(");
                    break;
                case ')':
                    if(!list.isEmpty()&&list.get(list.size()-1)=="("){
                        list.remove(list.size()-1);
                    }else{
                        return false;
                    }
                    break;
                case '[':
                    list.add("[");
                    break;
                case ']':
                    if(!list.isEmpty()&&list.get(list.size()-1)=="["){
                        list.remove(list.size()-1);
                    }else{
                        return false;
                    }
                    break;
                case '{':
                    list.add("{");
                    break;
                case '}':
                    if(!list.isEmpty()&&list.get(list.size()-1)=="{"){
                        list.remove(list.size()-1);
                    }else{
                        return false;
                    }
                    break;
                default:
            }

        }
        if(list.isEmpty()) {
            return true;
        } else{
            return false;
        }
    }
}