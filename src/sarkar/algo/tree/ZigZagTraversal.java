package sarkar.algo.tree;

import java.util.*;

public class ZigZagTraversal {

    public static List<List<Integer>> zigZagTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>();
            // Iterate Queue
            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = queue.poll();
                // adding parent node
                levelList.add(temp.val);
                // logic to add child nodes
                if (temp.left != null)
                    queue.offer(temp.left);
                if (temp.right != null)
                    queue.offer(temp.right);
            }
            if (flag) {
                Collections.reverse(levelList);
                flag = false;
            } else {
                flag = true;
            }
            list.add(levelList);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(6);
        System.out.println(zigZagTraversal(root));
    }

}
