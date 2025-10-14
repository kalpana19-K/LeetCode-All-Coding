public class Solution {

    public static boolean canJump(int[] nums){
        int maxReach = 0;
        for (int i= 0; i<nums.length; i++){

            if (i>maxReach) {
                return false;
            }
            maxReach = Math.max (maxReach, i+nums[i]);

            if (maxReach >= nums.length-1){
                return true ;
            }
        }
        return maxReach >= nums.length-1;
    }

        public static void main(String[] args){
            int[] nums1 = {2,3,1,1,4};
            int[] nums2 = {3,2,1,0,4};

            System.out.println(canJump(nums1));
            System.out.println(canJump(nums2));
        }
     }

        
    
