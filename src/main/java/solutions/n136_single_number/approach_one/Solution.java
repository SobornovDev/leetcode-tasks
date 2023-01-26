package solutions.n136_single_number.approach_one;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sobornov Vladimir
 * @since : 26.01.2023
 **/
public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : nums) {
            numsMap.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
