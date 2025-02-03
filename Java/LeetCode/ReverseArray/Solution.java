package com.code.practice;

public class ReverseArray {

	public void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseArray rArr = new ReverseArray();
		int[] nums = { 2, 4, 6, 3, 9, 11, 15, 10 };
		rArr.reverseArray(nums);
		for (int i : nums) {
			System.out.print(" " + i);
		}

	}

}
