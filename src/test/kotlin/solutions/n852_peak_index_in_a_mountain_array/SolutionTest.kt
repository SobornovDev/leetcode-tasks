package solutions.n852_peak_index_in_a_mountain_array

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun peakIndexInMountainArrayTest1() {
        Assert.assertEquals(1, solution.peakIndexInMountainArray(intArrayOf(1,2,1)))
    }

    @Test
    fun peakIndexInMountainArrayTest2() {
        Assert.assertEquals(3, solution.peakIndexInMountainArray(intArrayOf(0,1,2,5)))
    }

    @Test
    fun peakIndexInMountainArrayTest3() {
        Assert.assertEquals(0, solution.peakIndexInMountainArray(intArrayOf(10,5,1)))
    }
}