class Solution {
    public boolean isPalindrome(int x) {
        long a=2;
        long X=x;
        long result=0;
        if(x>=0){
            while(X!=0){
                a=X%10;
                X/=10;

                result+=a;
                result*=10;
            }
            result/=10;
            return result==x;

        }
        else{
            return false;
        }
    }
}