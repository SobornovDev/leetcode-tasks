package solutions.n367_valid_perfect_square

class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var lo: Long = 1
        var hi: Long = (num / 2).toLong()

        var mid: Long

        while (lo < hi) {
            mid = lo + (hi - lo) / 2
            if (mid*mid == num.toLong()) {
                return true
            } else if (mid*mid > num || mid*mid < 0) {
                hi = mid
            } else {
                lo = mid + 1
            }
        }
        return num == 1 || num == 4
    }
}