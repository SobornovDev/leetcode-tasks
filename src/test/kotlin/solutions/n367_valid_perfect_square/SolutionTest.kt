package solutions.n367_valid_perfect_square

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun isPerfectSquareTest1() {
        Assert.assertEquals(true, solution.isPerfectSquare(16))
    }

    @Test
    fun isPerfectSquareTest2() {
        Assert.assertEquals(false, solution.isPerfectSquare(14))
    }

    @Test
    fun isPerfectSquareTest3() {
        Assert.assertEquals(true, solution.isPerfectSquare(1849))
    }

    @Test
    fun isPerfectSquareTest4() {
        Assert.assertEquals(true, solution.isPerfectSquare(4))
    }

    @Test
    fun isPerfectSquareTest5() {
        Assert.assertEquals(true, solution.isPerfectSquare(808201))
    }
}