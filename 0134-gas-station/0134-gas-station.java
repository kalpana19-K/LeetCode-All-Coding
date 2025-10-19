class Solution {
    public  static int canCompleteCircuit(int[] gas, int[] cost) {
        int n= gas.length;
        int totalGas = 0;
        int tank = 0;
        int start = 0;
        int totalCost = 0;

        for(int i =0; i<n; i++){
            totalGas += gas[i];
            totalCost += cost[i];
          }

          if (totalGas < totalCost)return-1;
           for(int i = 0; i<n; i++){

            tank += gas[i] - cost[i];
             if (tank < 0){
             start = i+1;
             tank = 0;
            }
          }
          return start;
         }
         public static void main (String[] args){
         int [] gas = {1, 2, 3, 4, 5};
         int [] cost = {3, 4, 5, 1, 2};
         System.out.println(canCompleteCircuit (gas, cost));
        }
      }