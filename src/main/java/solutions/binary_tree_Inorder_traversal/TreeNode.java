package solutions.binary_tree_Inorder_traversal;

/**
 * @author : Sobornov Vladimir
 * @since : 02.02.2023
 **/
public class TreeNode<T> {
    private T val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(T val) {this.val = val;}

    TreeNode(T val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public T getValue() {
        return this.val;
    }

}
