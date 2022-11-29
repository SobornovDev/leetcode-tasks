package solutions.n744_find_smallest_letter_greater_than_target

class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var lo: Int = 0
        var hi: Int = letters.size
        var mid: Int

        while (lo < hi) {
            mid = lo + (hi - lo) / 2

            if (letters[mid] <= target) {
                lo = mid + 1
            } else {
                hi = mid
            }
        }
        return letters[lo % letters.size]
    }
}