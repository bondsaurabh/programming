import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String input = "abcdddcaaf";
		Scanner s = new Scanner(System.in);
		System.out.println("Please provide a sample string: ");
		String input = s.nextLine();
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		for(int i = 0; i< input.length(); i++) {
			if(countMap.get(input.charAt(i)) != null) {
				countMap.put(input.charAt(i), countMap.get(input.charAt(i))+1);
			} else {
				countMap.put(input.charAt(i), 1);
			}
		}
		System.out.println("Count Map is :" + countMap);

	}

}
