package solutions.n1_two_sums

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun twoSum1(){
        Assert.assertEquals(intArrayOf(0,1)[0], solution.twoSum(intArrayOf(2,7,11,15), 9)[0])
        Assert.assertEquals(intArrayOf(0,1)[1], solution.twoSum(intArrayOf(2,7,11,15), 9)[1])
    }

    @Test
    fun twoSum2(){
        Assert.assertEquals(intArrayOf(1,2)[0], solution.twoSum(intArrayOf(3,2,4), 6)[0])
        Assert.assertEquals(intArrayOf(1,2)[1], solution.twoSum(intArrayOf(3,2,4), 6)[1])
    }

    @Test
    fun twoSum3(){
        Assert.assertEquals(intArrayOf(0,1)[0], solution.twoSum(intArrayOf(3,3), 6)[0])
        Assert.assertEquals(intArrayOf(0,1)[1], solution.twoSum(intArrayOf(3,3), 6)[1])
    }

}