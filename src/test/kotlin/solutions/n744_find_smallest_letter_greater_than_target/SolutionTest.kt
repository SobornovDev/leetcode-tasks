package solutions.n744_find_smallest_letter_greater_than_target

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun nextGreatestLetterTest1() {
        Assert.assertEquals('c', solution.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'a'))
    }

    @Test
    fun nextGreatestLetterTest2() {
        Assert.assertEquals('f', solution.nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'c'))
    }

    @Test
    fun nextGreatestLetterTest3() {
        Assert.assertEquals('x', solution.nextGreatestLetter(charArrayOf('x', 'y', 'y'), 'z'))
    }

    @Test
    fun nextGreatestLetterTest4() {
        Assert.assertEquals('y', solution.nextGreatestLetter(charArrayOf('x', 'x', 'y'), 'x'))
    }
}