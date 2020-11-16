package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        root = insertHelper(root, valToInsert);
    }

    public static TreeNode<Integer> insertHelper(TreeNode<Integer> root, int valToInsert) {
        if (root == null) {
            return new TreeNode<>(valToInsert);
        }

        if (valToInsert < root.val) {
            root.left = insertHelper(root.left, valToInsert);
        } else {
            root.right = insertHelper(root.right, valToInsert);
        }

        return root;
    }
}
