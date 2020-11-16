package Problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {


        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);

        List<Integer> levelResult = new ArrayList<>();

        while (!q.isEmpty()) {
            TreeNode<Integer> node = q.poll();

            if (node == null) {
                result.add(levelResult);
                levelResult = new ArrayList<Integer>();

                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                levelResult.add(node.val);

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

        return result;
    }
}
