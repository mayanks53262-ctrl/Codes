class Solution {
    public int alternateDigitSum(int n) {
        int length =Integer.toString(n).length();
        boolean sign=true;
        if((length&1)==0){
            sign=false;
        }
        int sum =0;
        while(n!=0){
            int digit = n%10;
            if(sign){
                sum+=digit;
                sign=false;
            }
            else{
                sum-=digit;
                sign=true;
            }
            n=n/10;
        }return sum;
    } 
}