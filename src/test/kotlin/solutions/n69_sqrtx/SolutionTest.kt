package solutions.n69_sqrtx

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun mySqrtTest1() {
        Assert.assertEquals(2, solution.mySqrt(4))
    }

    @Test
    fun mySqrtTest2() {
        Assert.assertEquals(2, solution.mySqrt(7))
    }

    @Test
    fun mySqrtTest3() {
        Assert.assertEquals(3, solution.mySqrt(15))
    }
}