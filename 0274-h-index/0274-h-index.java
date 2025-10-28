class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n= citations.length;
        for (int i=0; i<n; i++){
            int h= n-i;

            if(citations [i] >=h){
                return h;
            }
        }
        return 0;
    }
        public static void main(String []args){
            Solution Sol = new Solution();
            int [] citations = {3, 7, 4, 5, 2, 1};
           System.out.println ("H-Index : " + Sol.hIndex(citations));
        }
        
    }
