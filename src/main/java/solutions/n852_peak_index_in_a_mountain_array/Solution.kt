package solutions.n852_peak_index_in_a_mountain_array

class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var lo = 0
        var hi = arr.size - 1
        var mid: Int

        while (lo < hi) {
            mid = lo + (hi - lo) / 2
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1
            } else {
                hi = mid
            }
        }
        return lo
    }
}