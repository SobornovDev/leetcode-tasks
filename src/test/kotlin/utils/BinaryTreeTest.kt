package utils

import org.junit.Assert
import org.junit.BeforeClass
import org.junit.Test
import solutions.utils.BinaryTree
import solutions.utils.TreeNode

class BinaryTreeTest {

    @Test
    fun findTest() {
        val root = TreeNode(52)
        root.setLeftNode(TreeNode(33))
        root.setRightNode(TreeNode(65))
        root.getLeftNode()?.setLeftNode(TreeNode(25))
        root.getLeftNode()?.setRightNode(TreeNode(39))
        root.getRightNode()?.setLeftNode(TreeNode(60))
        root.getRightNode()?.setRightNode(TreeNode(78))
        val binaryTree = BinaryTree(root)
        Assert.assertEquals(root.getLeftNode()!!.getLeftNode(), binaryTree.find(25))
    }
}