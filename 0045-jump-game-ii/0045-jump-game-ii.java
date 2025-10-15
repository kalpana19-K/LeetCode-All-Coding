class Solution {
    public  static int jump(int[] nums) {
        if(nums == null || nums.length <= 1)return 0;

        int jumps = 0;
        int curEnd = 0;
        int furthest = 0;

for (int i=0; i<nums.length-1; i++){
    furthest = Math.max(furthest ,i+nums[i]);
    if(i == curEnd){
        jumps++;
        curEnd = furthest;

        if(curEnd >= nums.length-1)break;
    }
 }
 return jumps;
 }
 public static void main (String[] args){
    int[] nums = {2,3,1,1,4};
   
    System.out.println(jump(nums));
   }
}