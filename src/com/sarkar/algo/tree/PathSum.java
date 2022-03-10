package com.sarkar.algo.tree;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(7);
		root.right = new TreeNode(9);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(7);
		//System.out.println("Tree has path: " + PathSum.hasPath(root, 23));
		//System.out.println("Tree has path: " + PathSum.hasPath(root, 16));
		List<List<Integer>> result = PathSum.findPaths(root, 12);
	    System.out.println("Tree paths with sum " + 12 + ": " + result);

	}

	public static boolean hasPath(TreeNode root, int sum) {
		if (root == null)
			return sum == 0;
		return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);
	}

	public static List<List<Integer>> findPaths(TreeNode root, int sum) {
		List<List<Integer>> allPaths = new ArrayList<>();
		List<Integer> currentPath = new ArrayList<>();
		findPathsHelper(root, sum, currentPath, allPaths);
		return allPaths;
	}

	private static void findPathsHelper(TreeNode root, int sum, List<Integer> currentPath,
			List<List<Integer>> allPaths) {

		if (root == null)
			return;
		
		currentPath.add(root.val);
		if (root.val == sum && root.left == null && root.right == null) {
			allPaths.add(new ArrayList<>(currentPath));
		} else {
			findPathsHelper(root.left, sum - root.val, currentPath, allPaths);
			findPathsHelper(root.right, sum - root.val, currentPath, allPaths);
		}
		
		currentPath.remove(currentPath.size() - 1);
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
};