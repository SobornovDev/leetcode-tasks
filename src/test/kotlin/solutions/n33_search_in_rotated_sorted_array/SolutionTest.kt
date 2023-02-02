package solutions.n33_search_in_rotated_sorted_array

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun searchTest() {
        Assert.assertEquals(3, solution.search(intArrayOf(4,5,6,7,8,9,10,11,12,13,14,15,16,0,1,2), 7))
    }
    @Test
    fun regularTest1() {
        Assert.assertEquals(7, solution.searchRegular(intArrayOf(1,2,3,4,5,6,7,8), 8))
    }

    @Test
    fun regularTes2() {
        Assert.assertEquals(0, solution.searchRegular(intArrayOf(1,2,3,4,5,6,7,8), 1))
    }

    @Test
    fun regularTes3() {
        Assert.assertEquals(2, solution.searchRegular(intArrayOf(1,2,3,4,5,6,7,8), 3))
    }
}