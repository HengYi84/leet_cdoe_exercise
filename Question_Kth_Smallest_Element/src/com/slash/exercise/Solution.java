package com.slash.exercise;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {

	public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
		// 1. 節點若為null則不做事
		if (root == null)
			return arr;
		// 2. 遍歷左節點，並放置ArrayList
		inorder(root.left, arr);
		arr.add(root.val);
		inorder(root.right, arr);
		return arr;
	}

	public int kthSmallest(TreeNode root, int k) {
		ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
	    return nums.get(k - 1);
	}

	public static void main(String[] args) {

	}
}
