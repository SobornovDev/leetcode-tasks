package solutions.binary_tree.children_sum_property

import org.junit.Test
import org.junit.Assert

class MainTest {
    private val main = Main()



    @Test
    fun hasChildrenSumPropertyTest() {
        /* Construct the following binary tree
          25
        /    \
       /      \
      /        \
     12        13
    /  \      /  \
   /    \    /    \
  7      5  6      7
*/
        val root = Node(25)
        root.left = Node(12)
        root.right = Node(13)
        root.left!!.left = Node(5)
        root.left!!.right = Node(7)
        root.right!!.left = Node(6)
        root.right!!.right = Node(7)
        Assert.assertNotEquals(Int.MIN_VALUE, main.hasChildrenSumProperty(root))
    }
}