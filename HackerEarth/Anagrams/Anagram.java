package hackerearth.practice;

import java.util.*;

class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner
		Scanner s = new Scanner(System.in);
		int testNum = s.nextInt();
		//int iter = 0;
		while (testNum-- > 0){
			String s1 = s.next();
			String s2 = s.next();
			System.out.println(countManipulations(s1, s2) + countManipulations(s2, s1));
			
		};
		s.close();

	}

	private static int countManipulations(String s1, String s2) {
		// TODO Auto-generated method stub
		int count = 0;
		// store the count of character
		int[] char_count = new int[26];

		// iterate though the first String and update char_count
		for (int i = 0; i < s1.length(); i++)
			char_count[s1.charAt(i) - 'a']++;

		// iterate through the second string and update char_count.
		// if character is not found in char_count
		// then increase count.
		for (int i = 0; i < s2.length(); i++)
			if (char_count[s2.charAt(i) - 'a']-- <= 0)
				count++;

		return count;
	}

}
