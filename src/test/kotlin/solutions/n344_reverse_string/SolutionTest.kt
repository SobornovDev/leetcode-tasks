package solutions.n344_reverse_string

import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {
    val solution = Solution()

    @Test
    fun reverseTest() {
        assertEquals("ytrewq", solution.reverse("qwerty"))
    }
}