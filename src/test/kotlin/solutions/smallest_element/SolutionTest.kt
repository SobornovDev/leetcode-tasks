package solutions.smallest_element

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun searchTest() {
        Assert.assertEquals(1, solution.contains(intArrayOf(1,2,3,4,5,6,7), 2))
    }

    @Test
    fun searchNotExistTest() {
        Assert.assertEquals(-1, solution.contains(intArrayOf(1,2,3,4,5,6,7), 9))
    }
}