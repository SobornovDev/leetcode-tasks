package solutions.n383_ransom_note;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author : Sobornov Vladimir
 * @since : 09.11.2022
 **/
public class SolutionTest {

    private static Solution solution;

    public SolutionTest() {
    }

    @BeforeClass
    public static void beforeClass() {
        solution = new Solution();
    }

    @Test
    public void canConstructTest() {
        Assert.assertEquals(true, solution.canConstruct("aab", "baa"));
    }
}
