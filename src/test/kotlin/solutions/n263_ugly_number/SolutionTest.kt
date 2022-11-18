package solutions.n263_ugly_number

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun isUglyTest() {
        Assert.assertEquals(true, solution.isUgly(8))
    }
}