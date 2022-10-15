class Solution {
    public int lengthOfLastWord(String s) {
        int length=s.toCharArray().length;
        boolean a=false;
        boolean b=false;
        int j=0;
        for(int i=length-1;i>0;i--){
            if (s.charAt(i)!=' '){
                a=true;
                b=true;
            }
            if(a){
                j++;
                a=false;
            }
            if(s.charAt(i)==' '&&b){
                return j;
            }
        }
        return s.strip().length();
    }
}