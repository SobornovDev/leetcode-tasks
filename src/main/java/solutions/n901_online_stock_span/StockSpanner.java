package solutions.n901_online_stock_span;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author : Sobornov Vladimir
 * @since : 09.11.2022
 *
 * Design an algorithm that collects daily price quotes for some stock
 * and returns the span of that stock's price for the current day.
 *
 * The span of the stock's price today is defined as the maximum number of
 * consecutive days (starting from today and going backward) for which the stock price
 * was less than or equal to today's price.
 **/
public class StockSpanner {

    private final Deque<Result> stocks = new ArrayDeque<>();


    public StockSpanner() {

    }

    public int next(int price) {
        int countDays = 1;

        while (!stocks.isEmpty() && stocks.peekLast().price <= price)
            countDays += stocks.pollLast().span;

        stocks.addLast(new Result(price, countDays));

        return countDays;
    }

    private class Result {

        Result (int price, int span) {
            this.price = price;
            this.span = span;
        }
        private final int price;
        private final int span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
