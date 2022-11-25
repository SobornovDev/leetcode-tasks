package solutions.n35_search_insert_position

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var lo = 0
        var hi = nums.size - 1
        var mid: Int
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2
            if (nums[mid] == target) {
                return mid
            }
            if (nums[mid] < target) {
                lo = mid + 1
            } else {
                hi = mid - 1
            }
        }

        return lo
    }
}