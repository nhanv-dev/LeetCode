package easy;

import java.util.HashMap;
import java.util.Map;

import common.ListNode;

public class EasyProblem {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 2, 2, 3 };
		System.out.print(wordPattern("abba", "dog cat cat dog"));

	}

	public static void moveZeroes(int[] nums) {

	}

	public static boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		if (words.length != pattern.length())
			return false;
		Map<String, Integer> index = new HashMap<>();
		Map<String, Integer> index2 = new HashMap<>();
		for (Integer i = 0; i < words.length; ++i)
			if (index2.put(String.valueOf(pattern.charAt(i)), i) != index.put(words[i], i))
				return false;
		return true;
	}

	public static int romanToInt(String s) {
		int result = 0;
		int temp = 0;
		int prev = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			switch (c) {
			case 'I': {
				temp = 1;
				break;
			}
			case 'V': {
				temp = 5;
				break;
			}
			case 'X': {
				temp = 10;
				break;
			}
			case 'L': {
				temp = 50;
				break;
			}
			case 'C': {
				temp = 100;
				break;
			}
			case 'D': {
				temp = 500;
				break;
			}
			case 'M': {
				temp = 1000;
				break;
			}
			default:
			}
			if (temp < prev) {
				result -= temp;
			} else {
				result += temp;
			}

			prev = temp;
		}
		return result;
	}

	public static String longestCommonPrefix(String[] strs) {
		String result = null;

		return result;
	}

	public static boolean validParentheses(String s) {
		boolean isContain = false;
		while (true) {
			s = s.replace("()", "");
			s = s.replace("{}", "");
			s = s.replace("[]", "");
			isContain = s.contains("()") || s.contains("{}") || s.contains("[]");
			if (!isContain)
				return s.length() == 0;
		}
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				list1.next = mergeTwoLists(list1.next, list2);
				return list1;
			} else {
				list2.next = mergeTwoLists(list1, list2.next);
				return list2;
			}
		}
		if (list1 == null)
			return list2;
		return list1;
	}

	public static int removeDuplicates(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

	public static int removeElement(int[] nums, int val) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}

}
