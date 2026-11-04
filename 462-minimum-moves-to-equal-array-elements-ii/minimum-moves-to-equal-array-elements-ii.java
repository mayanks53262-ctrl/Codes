class Solution {
    public int minMoves2(int[] nums) {
        int count=0;
        int med=0;
        Arrays.sort(nums);
        int even=(nums.length/2);
        int even1=(even+1);
        int odd=(nums.length+1)/2;
        if(nums.length%2==0){
            med=(nums[even-1]+nums[even1-1])/2;
        }
        else{
            med=nums[odd-1];
        }
        for(int i=0;i<nums.length;i++){
            count += Math.abs(nums[i]-med);
            }
        
        return count;
    }
}