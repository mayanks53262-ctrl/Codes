class Solution {
    public int missingNumber(int[] nums) {
        int nums2=0;
        List<Integer> nums1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            nums1.add(nums[i]);
        }
        for(int j=0;j<=nums.length;j++){
            if(!nums1.contains(j)){
                nums2=j;
            }
            
        }
    return nums2;     
    }
}