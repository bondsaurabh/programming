class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answers = new ArrayList<>();
		Set<Integer> set1 = convertArrayToSet(nums1);
		Set<Integer> set2 = convertArrayToSet(nums2);

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for (int i : set1) {
			if (!set2.contains(i)) {
				list1.add(i);
			}
		}

		for (int i : set2) {
			if (!set1.contains(i)) {
				list2.add(i);
			}
		}

		answers.add(list1);
		answers.add(list2);

		return answers; 
    }

    private Set<Integer> convertArrayToSet(int[] nums1) {
		Set<Integer> localSet = new HashSet<>();
		for (int num : nums1) {
			localSet.add(num);
		}
		return localSet;
	}
}
