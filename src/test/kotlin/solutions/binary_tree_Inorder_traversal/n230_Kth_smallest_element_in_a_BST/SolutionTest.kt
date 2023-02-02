package solutions.binary_tree_Inorder_traversal.n230_Kth_smallest_element_in_a_BST

import org.junit.Assert
import org.junit.Test
import solutions.binary_tree_Inorder_traversal.TreeNode

class SolutionTest {
    private val solution = Solution<Int>()
    private val root = TreeNode(25)

    @Test
    fun traversalTest() {
        root.left = TreeNode(10)
        root.right = TreeNode(35)
        root.left.left = TreeNode(2)
        root.left.right = TreeNode(8)
        root.right.left = TreeNode(30)
        root.right.right = TreeNode(45)
        val result = listOf(2, 10, 8, 25, 30, 35, 45)
        Assert.assertEquals(result, solution.traversal(root))
    }

    @Test
    fun kthSmallestTest() {
        root.left = TreeNode(10)
        root.right = TreeNode(35)
        root.left.left = TreeNode(2)
        root.left.right = TreeNode(8)
        root.right.left = TreeNode(30)
        root.right.right = TreeNode(45)
        Assert.assertEquals(10, solution.kthSmallest(root, 2))
        Assert.assertEquals(30, solution.kthSmallestStack(root, 5))
    }
}