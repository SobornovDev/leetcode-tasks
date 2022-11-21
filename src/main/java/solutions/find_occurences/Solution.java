package solutions.find_occurences;

import java.util.Arrays;

/**
 * @author : Sobornov Vladimir
 * @since : 19.11.2022
 **/

/*Write java function to find number of occurrences
of some number in given array of numbers*/
public class Solution {

    public long findOccurrences(int[] array, int x) {

        long occ = 0;
        if (array.length == 0) {
            return occ;
        }
        occ = Arrays.stream(array).filter(n -> n==x).count();
        return occ;
    }
}
