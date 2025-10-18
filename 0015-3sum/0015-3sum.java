class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet <>();  //HashSet for unique triplet
       int n = nums.length;

       for (int i =0; i< n-2; i++){
        for (int j = i+1; j < n-1 ; j++){
            for (int k= j+1; k<n;k++ ){
                if (nums[i] + nums [j] + nums[k] == 0){
                    List <Integer> triplet = Arrays.asList (nums [i] , nums [j] ,nums [k]);
                    Collections.sort(triplet); //sort to handle duplicate like [0.1.-1] == [-1,0,1]
                   set.add(triplet);  //Hashset automatically ignore duplicate
                    }
                }
            }
         }  
      
      return new ArrayList<>(set);  //convert back to List
  }
  //main function for adding
  public static void main (String [] args){
    int[] nums = {-1,0,1,2,-1,-4};
    List <List <Integer>> ans= threeSum (nums);
    System.out.println(ans);  //output= [-1 ,0,1] [-1,0,1]
  }
}