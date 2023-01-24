package solutions.remove_duplicates_from_sorted_array

class Solution {
    fun removeDuplicates (nums: IntArray): Int {
        var k = 1
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]
                k++
            }
        }
        return k
    }
}