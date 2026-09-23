class Solution {
    public int[] runningSum(int[] nums) {
        int prefixArr[]=new int[nums.length];
        int preValue=0;
        for(int index=0;index<nums.length;index++){
            prefixArr[index]=preValue +nums[index];
            preValue=prefixArr[index];
        }
    return prefixArr;    
    }
}