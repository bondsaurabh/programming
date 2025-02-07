class Solution {
    public int kthFactor(int n, int k) {
      //1. Solution 1
      //        List<Integer> factorList = new ArrayList();
//        int limit = n/2;
//        factorList.add(1);
//        for (int i=2; i <= limit; i++){
//            if(n % i == 0)
//                factorList.add(i);
//        }
//        factorList.add(n);
//        System.out.println("Factors are :: "+ factorList);
//        if(factorList.size() < k) return -1;
//        return factorList.get(k-1);
      
        // 2. Solution 2
        int count = 0;
        for (int i=1; i <= n; i++){
            if(n % i == 0) count ++;
            if(count == k) return i;
        }
        return -1;
        
    }
}
