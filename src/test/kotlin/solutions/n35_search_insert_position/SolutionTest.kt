package solutions.n35_search_insert_position

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun searchInsertTest1() {
        Assert.assertEquals(2, solution.searchInsert(intArrayOf(1,3,5,6), 5))
    }

    @Test
    fun searchInsertTest2() {
        Assert.assertEquals(1, solution.searchInsert(intArrayOf(1,3,5,6), 2))
    }

    @Test
    fun searchInsertTest3() {
        Assert.assertEquals(4, solution.searchInsert(intArrayOf(1,3,5,6), 7))
    }
}