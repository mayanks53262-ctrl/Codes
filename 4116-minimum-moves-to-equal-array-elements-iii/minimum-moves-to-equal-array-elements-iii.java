class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int a = Arrays.stream(nums).max().getAsInt();
        for(int i=0;i<nums.length;i++){
            while(nums[i] < a){
                nums[i] += 1;
                 count += 1;
            }
        }
        return count;
    }
}