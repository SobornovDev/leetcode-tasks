package solutions.n33_search_in_rotated_sorted_array

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun searchTest() {
        Assert.assertEquals(4, solution.search(intArrayOf(4,5,6,7,0,1,2), 0))
    }
}