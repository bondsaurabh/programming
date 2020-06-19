package hackerearth.practice;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class PalindromicString {
	
	    public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = br.readLine();                // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	*/
	        //Scanner
	        Scanner s = new Scanner(System.in);
	        String str = s.nextLine();                 // Reading input from STDIN
	        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	    

	        // Write your code here
	        String res = isPalindrome(str);
	        System.out.println(res); 

	    }
	    static String isPalindrome(String str){
	        int i=0, j=str.length() -1;
	        while(i < j) {
	            // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return "NO"; 
	  
	            // Increment first pointer and 
	            // decrement the other 
	            i++; 
	            j--;
	        }
	        return "YES";
	    }
	}
