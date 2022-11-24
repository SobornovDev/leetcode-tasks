package solutions.n4_median_of_two_sorted_arrays

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    private val solution = Solution();

    @Test
    fun findMedianSortedArraysTest1() {
        Assert.assertEquals(2.00000, solution.findMedianSortedArrays(intArrayOf(1,3), intArrayOf(2)), 10E-5)
    }

    @Test
    fun findMedianSortedArraysTest2() {
        Assert.assertEquals(2.50000, solution.findMedianSortedArrays(intArrayOf(3,4), intArrayOf(1,2)), 10E-5)
    }
}