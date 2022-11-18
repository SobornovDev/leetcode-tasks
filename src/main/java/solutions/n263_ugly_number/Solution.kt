package solutions.n263_ugly_number

class Solution {
    fun isUgly(n: Int): Boolean {
        if (n <= 0) {
            return false
        }
        val range: Array<Int> = arrayOf(2,3,5)
        var k = n
        for (i in range) {
            while (k % i == 0){
                k /= i
            }
        }
        return k == 1
    }
}