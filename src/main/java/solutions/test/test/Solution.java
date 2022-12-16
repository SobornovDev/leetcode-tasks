package solutions.test.test;

import java.util.*;

/**
 * @author : Sobornov Vladimir
 * @since : 13.12.2022
 *  Given infinite stream of integers.
 * Using only JDK library implement class which would process those
 * integers and at any moment will be able to provide at most N unique biggest values among all processed.
 * Class interface:
 * 1. N is class constructor argument, immutable.
 * 2. void push(int val) - process integers one-by-one.
 * 3. Collection<Integer> top().
 *
 **/
public class Solution<T extends Comparable> {

    public Solution(int n) {
        this.n = n;
        this.innerList = new TreeSet<>();
    }
    private final int n;
    private final TreeSet<T> innerList;

    public synchronized void push(T val) {
        if (innerList.size() >= n) { //4, 10 //
            if (innerList.first().compareTo(val) < 0 && !innerList.contains(val)) {
                innerList.pollFirst();
            } else {
                return;
            }
        }
        innerList.add(val);
    }

    // 1,2
    // 5 -> 2,5
    // 3 -> 3,5

    public Collection<T> top() {
        return innerList;
    }
}
