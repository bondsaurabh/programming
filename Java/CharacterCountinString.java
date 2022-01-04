package hackerearth.practice;

import java.util.Map;
import java.util.TreeMap;

public class CharacterCountinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenStr = "javapractice";
		Map<Character, Integer> countMap = new TreeMap<Character, Integer>();
		for (Character ch : givenStr.toCharArray()) {
			if(countMap.containsKey(ch)) {
				countMap.put(ch, countMap.get(ch) + 1);
			} else {
				countMap.put(ch,1);
			}			
		}
		System.out.println(" count of characters in given String is : " + countMap);

	}

}
