package solutions.utils

class TreeNode(private val data: Int) {
    private var left: TreeNode? = null
    private var right: TreeNode? = null

    fun find(data: Int): TreeNode? {
        if (this.data == data) {
            return this
        }

        if (this.data > data && left != null) {
            return left!!.find(data)
        }

        if (right != null) {
            return right!!.find(data)
        }
        return null
    }

    fun insert(data: Int) {
        if (data >= this.data) {
            if (this.right == null) {
                this.right = TreeNode(data)
            } else {
                insert(this.right!!.getData())
            }
        } else {
            if (this.left == null) {
                this.left = TreeNode(data)
            } else {
                insert(this.left!!.getData())
            }
        }
    }

    fun getData(): Int {
        return this.data
    }

    fun getLeftNode(): TreeNode? {
        return this.left
    }

    fun getRightNode(): TreeNode? {
        return this.right
    }

    fun setLeftNode(node: TreeNode?) {
        this.left = node
    }

    fun setRightNode(node: TreeNode?) {
        this.right = node
    }
}