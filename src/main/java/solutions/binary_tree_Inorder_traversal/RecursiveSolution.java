package solutions.binary_tree_Inorder_traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : Sobornov Vladimir
 * @since : 02.02.2023
 **/
public class RecursiveSolution <T> {
    public List<T> inorderTraversal (TreeNode root) {
        List<T> list = new ArrayList<>();

        helper(root, list);

        return list;
    }

    private void helper(TreeNode root, List<T> list) {
        if (root != null) {
            helper(root.left, list);
            list.add((T) root.getValue());
            helper(root.right, list);

        }
    }

    public List<T> inorderTraversalStack(TreeNode root) {
        List<T> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add((T) root.getValue());
            root = root.right;
        }
        return list;
    }
}
