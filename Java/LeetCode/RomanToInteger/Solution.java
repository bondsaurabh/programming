class Solution {

    static Map<String, Integer> fixValues = new HashMap();

    static {
        fixValues.put("I", 1);
        fixValues.put("V", 5);
        fixValues.put("X", 10);
        fixValues.put("L", 50);
        fixValues.put("C", 100);
        fixValues.put("D", 500);
        fixValues.put("M", 1000);
        fixValues.put("IV", 4);        
        fixValues.put("IX", 9);
        fixValues.put("XL", 40);
        fixValues.put("XC", 90);
        fixValues.put("CD", 400);        
        fixValues.put("CM", 900);
    }
    public int romanToInt(String s) {
        int sum =0;
        int i=0;

        while(i<s.length()){
            if(i<s.length() -1) {
                String doubleSymbols = s.substring(i, i+2);
                if(fixValues.containsKey(doubleSymbols)) {
                    sum+=fixValues.get(doubleSymbols);
                    i = i + 2;
                    continue;
                }
            }

            String singleSymbol = s.substring(i,i+1);
            sum += fixValues.get(singleSymbol);
            i = i+1;

        }
        return sum;
    }
}
