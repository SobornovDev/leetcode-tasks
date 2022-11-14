package solutions.n151_reverse_words_in_a_string

import org.junit.Assert
import org.junit.Test




class SolutionTest {

    private val solution = Solution()

    @Test
    fun testReverseWords1() {
        Assert.assertEquals("blue is sky the", solution.reverseWords("the sky is blue"))
    }

    @Test
    fun testReverseWords2() {
        Assert.assertEquals("world hello", solution.reverseWords("  hello world  "))
    }

    @Test
    fun testReverseWords3() {
        Assert.assertEquals("example good a", solution.reverseWords("a good   example"))
    }
}