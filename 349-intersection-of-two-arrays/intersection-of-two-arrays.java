class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       ArrayList<Integer> a=new ArrayList<>();
       ArrayList<Integer> c=new ArrayList<>();
       for(int i=0;i<nums1.length;i++){
            a.add(nums1[i]);
       }
       for(int k=0;k<nums2.length;k++){
            if(a.contains(nums2[k])){{
                if(!c.contains(nums2[k])){
                    c.add(nums2[k]);
                }
            }
                
            }
       }
     return c.stream().mapToInt(Integer::intValue).toArray();

    }
}