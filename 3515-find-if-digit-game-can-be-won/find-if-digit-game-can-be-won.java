class Solution {
    public boolean canAliceWin(int[] nums) {
        int sinCount=0;
        int multiCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sinCount+=nums[i];
            }
            else{
                multiCount+=nums[i];
            }
        }
        if(sinCount==multiCount){
            return false;
        }
        else{
            return true;
        }
    }
}