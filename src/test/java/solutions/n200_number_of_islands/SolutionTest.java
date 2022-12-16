package solutions.n200_number_of_islands;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author : Sobornov Vladimir
 * @since : 02.12.2022
 **/
public class SolutionTest {
    char[][] testGrid1 = {{'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','0'}};
    char[][] testGrid2 = {{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};

    @Test
    public void numIslandsTest1() {
        Assert.assertEquals(1, Solution.numIslands(testGrid1));
    }

    @Test
    public void numIslandsTes2() {
        Assert.assertEquals(3, Solution.numIslands(testGrid2));
    }
}
