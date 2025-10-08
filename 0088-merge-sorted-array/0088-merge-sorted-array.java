class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer>pq = new  PriorityQueue<>();

        //Add first m element of nums1

        for(int i = 0; i<m; i++){
            pq.add(nums1[i]);
        }

        //Add all elements of nums2 
         for(int i = 0 ; i<n ; i++){
            pq.add(nums2 [i]);
        
         }
         //Refill nums1 in sorted order 
         int i= 0;
         while (!pq .isEmpty()){
            nums1[i++] = pq.poll();

         }
        
    }
}