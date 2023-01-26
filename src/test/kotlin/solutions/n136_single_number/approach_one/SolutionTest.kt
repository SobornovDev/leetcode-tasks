package solutions.n136_single_number.approach_one

import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {
    val solution = Solution()

    @Test
    fun singleNumberTest1() {
        assertEquals(1, solution.singleNumber(intArrayOf(1,2,2)))
    }

    @Test
    fun singleNumberTest2() {
        assertEquals(4, solution.singleNumber(intArrayOf(1,2,2,1,3,4,3)))
    }
}