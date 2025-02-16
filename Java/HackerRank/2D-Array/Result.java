import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    int maxSum = Integer.MIN_VALUE;
    //traverse the given 2 D Array and find sum of subset array
    for(int i=0; i< arr.size()-2; i++){
        for(int j=0; j< arr.get(i).size() -2; j++){
            int currSum = calculateHourglassSum(arr, i, j);
            maxSum = Math.max(currSum, maxSum);
        }
    }    
    return maxSum;

    }
    
    public static int calculateHourglassSum(List<List<Integer>> arr, int start, int end) {
        return arr.get(start).get(end) + arr.get(start).get(end+1) + arr.get(start).get(end+2) + arr.get(start+1).get(end+1) + arr.get(start+2).get(end) + arr.get(start+2).get(end+1) + arr.get(start+2).get(end+2);  
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
