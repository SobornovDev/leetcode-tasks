package solutions.n733_flood_fill;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author : Sobornov Vladimir
 * @since : 02.12.2022
 **/

public class SolutionTest {

    int[][] test2DArray = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
    int[][] test2DArrayAssert = { { 2, 2, 2 }, { 2, 2, 0 }, { 2, 0, 1 } };

    @Test
    public void floodFillTest() {
        Assert.assertEquals(test2DArrayAssert , Solution.floodFill(test2DArray, 1, 1, 2));
    }
}
