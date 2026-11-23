import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
    ArrayList<Integer> b=new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
        if(!b.contains(nums[i])){
            b.add(nums[i]);
            }
        }
    if(b.size()<3){
        return Collections.max(b);
    }
    else{
        return b.get(b.size()-3);   
    }    

    }     
    
              
}