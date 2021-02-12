package hackerearth.practice;

import java.util.Scanner;

public class TwoIdenticalStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = 0;
		if (s.hasNextInt()) { // This check is required to avoid NoSuchElementException
			n = s.nextInt();
		}
		while (n > 0) {
			String s1 = s.next();
			String s2 = s.next();
			// System.out.println("Input Strings are: " + s1 + " " + s2);
			int[] a = new int[26]; // for string s1
			int[] b = new int[26]; // for string s2

			int len = s1.length();
			// System.out.println("String length: "+len);
			for (int i = 0; i < len; i++) {
				int x = s1.charAt(i) - 97;
				a[x] = a[x] + 1;
				int y = s2.charAt(i) - 97;
				b[y] = b[y] + 1;
			}
			// now count the differences
			int count = 0;
			for (int i = 0; i < 26; i++) {
				if (a[i] != b[i]) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			n--;
		}

	}

}
