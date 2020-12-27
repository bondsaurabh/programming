import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String input = "abcdddcaaf";
		Scanner s = new Scanner(System.in);
		System.out.println("Please provide a sample string: ");
		String input = s.nextLine();
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (countMap.get(input.charAt(i)) != null) {
				countMap.put(input.charAt(i), countMap.get(input.charAt(i)) + 1);
			} else {
				countMap.put(input.charAt(i), 1);
			}
		}
		System.out.println("Count Map is :" + countMap);
		int num = 1;

		List<Integer> collect = countMap.values().stream().collect(Collectors.toList());

		collect.sort((o1, o2) -> o2 - o1);
		System.out.println(collect);
		Integer integer = collect.get(num - 1);

		countMap.entrySet().forEach(e -> {
			if (e.getValue() == integer) {
				System.out.println("Character with Max frequency is: " + e.getKey());
			}
		});

	}

}
