package com.sarkar.algo.tree;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPaths {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		List<List<Integer>> result = RootToLeafPaths.findPaths(root);
		System.out.println(result);

	}

	private static List<List<Integer>> findPaths(TreeNode root) {
		List<Integer> currentPath = new ArrayList<>();
		List<List<Integer>> allPaths = new ArrayList<>();
		findPathsHelper(root, currentPath, allPaths);
		return allPaths;
	}

	private static void findPathsHelper(TreeNode root, List<Integer> currentPath, List<List<Integer>> allPaths) {
		if (root == null)
			return;
		currentPath.add(root.val);
		if (root.left == null && root.right == null) {
			allPaths.add(new ArrayList<>(currentPath));
		} else {
			findPathsHelper(root.left, currentPath, allPaths);
			findPathsHelper(root.right, currentPath, allPaths);
		}
		currentPath.remove(currentPath.size() - 1);
	}

}
