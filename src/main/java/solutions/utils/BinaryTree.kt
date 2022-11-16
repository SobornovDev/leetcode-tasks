package solutions.utils

class BinaryTree(private var root: TreeNode?) {

    fun insert(data: Int) {
        if (this.root == null) {
            this.root = TreeNode(data)
        } else {
            this.root!!.insert(data)
        }

    }

    fun find(data: Int): TreeNode? {
        return root?.find(data)
    }

    fun delete (data: Int) {
        var current: TreeNode? = this.root
        var parent: TreeNode? = this.root
        var isLeftChild: Boolean = false

        if (current == null) {
            return
        }

        while (current != null && current.getData() != data) {
            parent = current
            if (current.getData() > data) {
                current = current.getLeftNode()!!
                isLeftChild = true
            } else {
                current = current.getRightNode()!!
                isLeftChild = false
            }
        }

        if (current == null) {
            print("No such element: $data")
            return
        }

        if (current.getLeftNode() == null && current.getRightNode() == null) {
            if (current == root) {
                root = null
            }
            if (isLeftChild) {
                parent?.setLeftNode(null)
            } else {
                parent?.setRightNode(null)
            }
        }

    }
}