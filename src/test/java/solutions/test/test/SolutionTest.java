package solutions.test.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @author : Sobornov Vladimir
 * @since : 13.12.2022
 **/
public class SolutionTest {
    private final Solution solution = new Solution(2);


    @Test
    public void topTest1() {
        TreeSet<Integer> testRes = new TreeSet<>();
        testRes.add(4);
        testRes.add(10);

        solution.push(1);
        solution.push(3);
        solution.push(2);
        solution.push(4);
        solution.push(1);
        solution.push(10);
        solution.push(1);
        solution.push(2);
        System.out.println(solution.top());
        Assert.assertEquals(testRes, solution.top());
    }

    @Test
    public void topTest2() {
        TreeSet<Integer> testRes = new TreeSet<>();
        testRes.add(10);

        solution.push(10);
        Assert.assertEquals(testRes, solution.top());
    }

    @Test
    public void topTest3() {
        TreeSet<Integer> testRes = new TreeSet<>();
        testRes.add(4);
        testRes.add(10);

        solution.push(1);
        solution.push(3);
        solution.push(2);
        solution.push(4);
        solution.push(1);
        solution.push(10);
        solution.push(10);
        Assert.assertEquals(testRes, solution.top());
    }
}
