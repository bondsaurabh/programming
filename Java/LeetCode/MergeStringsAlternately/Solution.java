class Solution {
    public String mergeAlternately(String word1, String word2) {
        //merge word1 and word2 chars one by one
        String res = "";
        int m = word1.length();
        int n = word2.length();
        // if(m==n) {
        //     for(int i=0;i<m;i++){
        //         res= res + word1.charAt(i) + word2.charAt(i);
        //     }
        // } else if(m<n) {
        //     for(int i=0;i<m;i++){
        //         res= res + word1.charAt(i) + word2.charAt(i);
        //     }
        //     for(int i=m;i<n;i++){
        //         res= res + word2.charAt(i);
        //     }
        // } else {
        //     for(int i=0;i<n;i++){
        //         res= res + word1.charAt(i) + word2.charAt(i);
        //     }
        //     for(int i=n;i<m;i++){
        //         res= res + word1.charAt(i);
        //     }
        // }
        //Solution 2
        for(int i=0; i<m || i<n ; i++) {
        	if(i<m) res = res+ word1.charAt(i);
        	if(i<n) res = res+ word2.charAt(i);
        	//System.out.println("merged :: " + res);
        }
        return res;
    }
}
