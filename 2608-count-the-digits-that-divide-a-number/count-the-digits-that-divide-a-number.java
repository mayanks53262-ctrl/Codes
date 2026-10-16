class Solution {
    public int countDigits(int num) {
        int count=0;
        String a=String.valueOf(num);
        for (int i=0;i<a.length();i++){
            int digit =a.charAt(i)-'0';
            if (num%digit==0){
                count++;
            }
        }
        return count;
    }
}