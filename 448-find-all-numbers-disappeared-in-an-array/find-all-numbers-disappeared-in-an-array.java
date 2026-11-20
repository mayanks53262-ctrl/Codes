class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen=new boolean[nums.length+1];
        Arrays.sort(nums); 
        ArrayList<Integer> b=new ArrayList<>();
        for (int num : nums) {
           seen[num] = true;
        }
        for(int i=1;i<nums.length+1;i++){       
            if(seen[i]!=true){
                b.add(i);
            }
        }
    return b;    
    }
}