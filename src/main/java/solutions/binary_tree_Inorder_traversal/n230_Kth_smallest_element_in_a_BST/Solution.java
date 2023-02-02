package solutions.binary_tree_Inorder_traversal.n230_Kth_smallest_element_in_a_BST;

import solutions.binary_tree_Inorder_traversal.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : Sobornov Vladimir
 * @since : 02.02.2023
 **/
public class Solution <T>{
    public int kthSmallest(TreeNode root, int k) {
        List<T> result = inorder(root, new ArrayList<>());
        return (int) result.get(k - 1);
    }

    public List<T> traversal(TreeNode root) {
        return inorder(root, new ArrayList<>());
    }

    private List<T> inorder(TreeNode root, List<T> list) {
        if (root != null) {
            inorder(root.getLeft(), list);
            list.add((T) root.getValue());
            inorder(root.getRight(), list);
        }
        return list;
    }

    public int kthSmallestStack(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.getLeft();
            }
            root = stack.pop();
            if (--k == 0) return (int) root.getValue();
            root = root.getRight();
        }
        return -1;
    }
}
