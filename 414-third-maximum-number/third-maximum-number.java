import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.contains(nums[i])) {
                numbers.add(nums[i]);
            }
        }
        Collections.sort(numbers);
        int a = numbers.size() - 1;
        if (a < 2) {
            return numbers.get(a);
        }
        return numbers.get(a - 2);
    }
}