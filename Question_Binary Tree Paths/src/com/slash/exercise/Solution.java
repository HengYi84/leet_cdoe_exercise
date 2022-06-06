package com.slash.exercise;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<String>();
		result = addPaths(root, "", result);
		return result;
	}

	/**
	 * 遞迴紀錄路徑位置
	 * @param root
	 * @param paths
	 * @param result
	 * @return
	 */
	public static List<String> addPaths(TreeNode root, String paths, List<String> result) {
		// 如果到最後節點，紀錄並存入List
		if (root.left == null && root.right == null) {
			result.add(paths + root.val);
		}

		// 如果存在左節點，則紀錄當前節點值，並往左節點往下走
		if (root.left != null) {
			addPaths(root.left, paths + root.val + "->", result);
		}

		// 如果存在右節點，則紀錄當前節點值，並往右節點往下走
		if (root.right != null) {
			addPaths(root.right, paths + root.val + "->", result);
		}

		return result;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		System.out.println(binaryTreePaths(root));
	}
}
