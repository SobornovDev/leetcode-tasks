package solutions.binary_tree_Inorder_traversal.inorder_traversal

import org.junit.Assert
import org.junit.Test
import solutions.binary_tree_Inorder_traversal.TreeNode

class RecursiveSolutionTest {
    private val solution =
        RecursiveSolution<Int>()

    private val root = TreeNode(25)

    @Test
    fun inorderTraversal() {
        root.left = TreeNode(10)
        root.right = TreeNode(15)
        root.left.left = TreeNode(2)
        root.left.right = TreeNode(8)
        root.right.left = TreeNode(4)
        root.right.right = TreeNode(11)
        val result = listOf(2, 10, 8, 25, 4, 15, 11)
        Assert.assertEquals(result, solution.inorderTraversal(root))
        Assert.assertEquals(result, solution.inorderTraversalStack(root))
    }
}