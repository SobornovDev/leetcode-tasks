package solutions.n1047_remove_all_adjacent_duplicates_In_string;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author : Sobornov Vladimir
 * @since : 10.11.2022
 **/
public class SolutionTest {

    private static Solution solution;

    @BeforeClass
    public static void beforeClass() {
        solution = new Solution();
    }

    @Test
    public void removeDuplicatesTest() {
        Assert.assertEquals("ca", solution.removeDuplicates("abbaca"));
    }

    @Test
    public void removeDuplicatesLongStringTest() {
        Assert.assertEquals("ay", solution.removeDuplicates("azxxzy"));
    }

    @Test
    public void removeDuplicatesSimpleStringTest() {
        Assert.assertEquals("a", solution.removeDuplicates("aaaaaaaaaaa"));
    }
}
