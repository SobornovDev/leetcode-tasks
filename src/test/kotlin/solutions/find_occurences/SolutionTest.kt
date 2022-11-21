package solutions.find_occurences

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun findOccurrencesTest() {
        Assert.assertEquals(3, solution.findOccurrences(intArrayOf(5,6,4,3,2,9,11,12,4,7,8,4), 4))
    }
}