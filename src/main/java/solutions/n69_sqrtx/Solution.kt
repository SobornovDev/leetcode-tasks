package solutions.n69_sqrtx

class Solution {
    fun mySqrt(x: Int): Int {
        var lo: Long = 1
        var hi: Long = (x / 2 + 1).toLong()
        var mid: Long

        if (x == 0) {
            return 0
        }
        while (lo < hi) {
            mid = lo + (hi - lo) / 2
            if (mid*mid == x.toLong()) {
                return mid.toInt()
            } else if (mid*mid > x || mid*mid < 0) {
                hi = mid - 1
            } else {
                lo = mid + 1
            }
        }
        if (lo*lo > x.toLong()) {
            return (lo - 1).toInt()
        }
        return lo.toInt()
    }
}