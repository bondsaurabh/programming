package com.code.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1 = Arrays.asList(1, 3, 5, 9, 10, 15, 22);
		List<Integer> list2 = Arrays.asList(4, 6, 8, 12, 13, 16, 18, 20);

		List<Integer> mergedList = mergeSortedArrays(list1, list2);
		System.out.println("Merged List is:: " + mergedList);

		printOddNumbers(list1);
		printOddNumbers(list2);
		printSquaresOfOddNumbers(list1);

		List<String> courseList = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Docker");
		courseList.stream().forEach(s -> System.out.print(" " + s));

		courseList.stream().filter(s -> s.contains("Spring")).forEach(System.out::println);
		courseList.stream().forEach(str -> System.out.println(str + " " + str.length()));
		courseList.stream().map(str -> str + " " + str.length()).forEach(System.out :: println);

	}

	private static void printOddNumbers(List<Integer> list) {
		list.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
	}

	private static void printSquaresOfOddNumbers(List<Integer> list) {
		list.stream().
		filter(n -> n % 2 != 0)
		.map(x -> x*x)
		.forEach(System.out::println);
	}

	private static List<Integer> mergeSortedArrays(List<Integer> list1, List<Integer> list2) {
		// TODO Auto-generated method stub

		return Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());

	}

}
