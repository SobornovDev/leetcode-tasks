package solutions.binary_tree_Inorder_traversal;

/**
 * @author : Sobornov Vladimir
 * @since : 02.02.2023
 **/
public class TreeNode<T> {
    private T val;
    private TreeNode left;

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    private TreeNode right;

    public TreeNode() {}
    public TreeNode(T val) {this.val = val;}

    public TreeNode(T val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public T getValue() {
        return this.val;
    }
    public TreeNode getRight() { return  this.right; }
    public TreeNode getLeft() {
        return this.left;
    }

}
