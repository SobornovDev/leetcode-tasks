package solutions.remove_duplicates_from_sorted_array

import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {
    val solution = Solution()

    @Test
    fun removeDuplicatesTest() {
        val testNum: IntArray = intArrayOf(1,1,1,2,3,4,4,5,5,5,5)
        val expectNum: IntArray = intArrayOf(1,2,3,4,5)
        val k = solution.removeDuplicates(testNum)
        for (i in expectNum.indices) {
            assertEquals(expectNum[i],testNum[i])
        }
        assertEquals(5, k)
    }
}