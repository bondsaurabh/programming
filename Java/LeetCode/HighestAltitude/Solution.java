class Solution {
    public int largestAltitude(int[] gain) {
        //Solution 1
        // int n = gain.length;
        // int[] altitude = new int[n+1];
        // altitude[0]= 0;
        // for(int i=1; i<n; i++){
        //     altitude[i] = altitude[i-1] + gain[i-1];
        // }
        // altitude[n] = altitude[n-1] + gain[n-1];
                
        // Arrays.sort(altitude);
        
        // return altitude[n];

        // Solution 2
        int current =0;
        int max = 0;
        for(int i=0; i<gain.length; i++){
            current = current + gain [i];
            max = Math.max(current, max);
        }
        return max;
    }
}
