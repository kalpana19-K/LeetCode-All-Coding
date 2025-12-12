class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer>lastIndex = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            if(lastIndex.containsKey(val)){
                 
                 int prev = lastIndex.get(val);
                 if(i-prev <= k){
                 return true;
            }
         }
        
        lastIndex.put(val, i);
    }
    return false;
   }
}
