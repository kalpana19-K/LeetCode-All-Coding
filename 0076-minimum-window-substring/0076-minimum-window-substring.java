class Solution {
    public static String minWindow(String s, String t) {
        if (s==null || t==null || s.length () < t.length()) return "";
        int [] need = new int [128];

        for (char c :t.toCharArray())need [c]++;
        int required = t.length();
        int left = 0, right = 0; 
         int minLen = Integer.MAX_VALUE, minLeft = 0;

        while (right <s.length()){
            char c = s.charAt (right);

            if(need[c] > 0)required--;
            need[c]--;
            right++;

            while (required == 0){
                if(right - left < minLen){
                    minLen = right-left;
                    minLeft = left;
                }
                    char d = s.charAt(left);
                    need [d]++;
                    if (need[d] > 0) required++;
                    left++;
                }
            }
            return minLen == Integer.MAX_VALUE ?"": s.substring(minLeft, minLeft + minLen);

        }
        public static void main(String[] args){
            System.out.println(Solution.minWindow("ADOBECODEANC" , "ABC"));
        }
    }

    
    
