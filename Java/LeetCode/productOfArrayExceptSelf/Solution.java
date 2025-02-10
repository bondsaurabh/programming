class Solution {
    public int[] productExceptSelf(int[] nums) {
      
        //Solution 1
        // int[] out = new int[nums.length];
        // //initialize each position with 1
        // for(int i=0; i< nums.length; i++){
        //     out[i] = 1;
        // }
        // for(int i=0; i<nums.length;i++) {
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j) {
        //             out[i] = out[i] * nums[j];
        //         }
        //     }
        // }
        //Solution 2
        int n = nums.length;
        int[] prefResult = new int [n];
        int[] suffResult = new int [n];
        int[] out = new int [n];

        prefResult[0] = 1;
        for(int i = 1; i< n; i++){
            prefResult[i] = prefResult[i-1] * nums[i-1];
        }
        suffResult[n-1] = 1;
        for (int j = n-2; j>=0;j--){
            suffResult[j] = suffResult[j+1]* nums[j+1];        
        }

        for(int i=0; i<n; i++){
            out[i] = prefResult[i] * suffResult[i];
        }

        return out;

    }
}
