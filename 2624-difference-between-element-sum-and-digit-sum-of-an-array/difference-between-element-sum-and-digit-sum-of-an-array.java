class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            int num=nums[j];
            while(num>0){
                digitSum+=num%10;
                num=num/10;
            }
            }
        
        return sum - digitSum;
    }
}