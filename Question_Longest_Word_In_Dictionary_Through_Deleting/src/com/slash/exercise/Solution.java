package com.slash.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Solution {

	public static String findLongestWord(String s, List<String> dictionary) {
		System.out.println("before sort : " + dictionary);
		// 1. 排序按照長度 在按照 lexicographical
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length()) {
					return -(o1.length() - o2.length());
				} else {
					return o1.compareTo(o2);
				}
			}
		};

		dictionary.sort(comparator);
		System.out.println("after sort : " + dictionary);

		for (String word : dictionary) {
			// 2. 符合Subsequence檢查
			if (isSubsequence(word, s))
				return word;
		}

		return "";
	}

	public static boolean isSubsequence(String word, String s) {
		int j = 0;
		// 遍歷s，若符合word的字，word往下一個字移動，i長度不得超過s，j長度不得超過word
		for (int i = 0; i < s.length() && j < word.length(); i++)
			if (word.charAt(j) == s.charAt(i))
				j++;
		return j == word.length();
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ale");
		list.add("apple");
		list.add("monkey");
		list.add("plea");
		list.add("abpcplaaa");
		list.add("abpcllllll");
		list.add("abccclllpppeeaaaa");
		System.out.println("result : " + findLongestWord("qpwle.a", list));
	}
}
