package solutions.binary_tree.children_sum_property
class Node (val data: Int) {
    var left: Node? = null
    var right: Node? = null
}

class Main {
    fun hasChildrenSumProperty(root : Node?) : Int {
        if (root == null) {
            return Int.MIN_VALUE
        }

        if (root.left == null && root.right == null) {
            return root.data
        }

        val left = hasChildrenSumProperty(root.left)
        val right = hasChildrenSumProperty(root.right)

        if (left != Int.MIN_VALUE && right != Int.MIN_VALUE && root.data == left + right) {
            return root.data
        }
        return Int.MIN_VALUE
    }


}