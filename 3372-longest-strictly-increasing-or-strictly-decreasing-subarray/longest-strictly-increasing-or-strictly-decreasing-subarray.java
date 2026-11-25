
import java.util.*;

class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        List<Integer> nums1 = new ArrayList<>();
        int count = 1;
        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i+1]) {

                if(nums1.isEmpty()) {
                    nums1.add(nums[i]);
                }

                nums1.add(nums[i+1]);

                count = Math.max(count, nums1.size());
            }
            else {
                nums1.clear();
            }
        }

        nums1.clear();
        for(int j = 0; j < nums.length - 1; j++) {

            if(nums[j] > nums[j+1]) {

                if(nums1.isEmpty()) {
                    nums1.add(nums[j]);
                }

                nums1.add(nums[j+1]);

                count = Math.max(count, nums1.size());
            }
            else {
                nums1.clear();
            }
        }

        return count;
    }
}
