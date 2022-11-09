package solutions.n901_online_stock_span;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Sobornov Vladimir
 * @since : 09.11.2022
 **/
public class StockSpannerTest {

    private static StockSpanner stockSpanner;

    int[] testStocks = {100,80,60,70,60,75,85};
    int[] testComplexStocks = {31,41,48,59,79};

    public StockSpannerTest() {

    }

    @Before
    public void createNewStockSpanner() {
        stockSpanner = new StockSpanner();
    }

    @Test
    public void nextTest() {
        Assert.assertEquals(1, stockSpanner.next(100));
    }

    @Test
    public void nextArrayTest() {
        List<Integer> expectedSpans = new ArrayList<>(Arrays.asList(1,1,1,2,1,4,6));
        List<Integer> actualSpans = new ArrayList<>();
        Arrays.stream(testStocks).forEach(e -> actualSpans.add(stockSpanner.next(e)));
        Assert.assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void nextComplexArrayTest() {
        List<Integer> expectedSpans = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> actualSpans = new ArrayList<>();
        Arrays.stream(testComplexStocks).forEach(e -> actualSpans.add(stockSpanner.next(e)));
        Assert.assertEquals(expectedSpans, actualSpans);
    }
}
