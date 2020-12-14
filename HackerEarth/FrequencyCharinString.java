package hackerearth.practice;

import java.util.Scanner;

public class FrequencyCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter Char to be found");
		Scanner s = new Scanner(System.in);
        char charTobeFound = s.nextLine().charAt(0);
        //System.out.println("Char to be found is:" + charTobeFound);
        //System.out.println("Please enter required string");
        String inputStr = s.nextLine();
        int count =0;
        for(int i=0; i< inputStr.length(); i++) {
        	if(charTobeFound == inputStr.charAt(i))
        		count++;
        	
        }
        
        //System.out.println("Frequency of "+ charTobeFound + " is: "+ count);
        System.out.println(count);
        
	}

}
