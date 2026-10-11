class Solution {
    public boolean threeFibonacciSum(int n) {
        int a = 0;
            int b= 1;

        while (true) {
            int c= a+b;
            int sum = a+b+c;

            if (sum == n){
                return true;
            }
            if(sum > n){
                return false;
            }
            a=b;
            b=c;
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna