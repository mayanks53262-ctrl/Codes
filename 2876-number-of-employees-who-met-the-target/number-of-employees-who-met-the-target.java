class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count =0;
        for(int i=0;i<hours.length;i++){
            int a=hours[i];
            if(a>=target){
                count+=1;
            }
        }
        return count;
    }
}