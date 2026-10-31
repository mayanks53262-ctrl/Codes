class Solution {
    public int arraySign(int[] nums) {
        long countofzero = Arrays.stream(nums)
                    .filter(num -> num == 0)
                    .count();
        if(countofzero >=1){
            return 0;
        }

        long count = Arrays.stream(nums)
                    .filter(num -> num < 0)
                    .count();
        if(count % 2 == 0){
            return 1;
        } else{
            return -1;
        }
        
    }
}