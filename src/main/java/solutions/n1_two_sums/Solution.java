package solutions.n1_two_sums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sobornov Vladimir
 * @since : 24.11.2022
 **/
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int complement = 0;

        Map<Integer, Integer> numsMap = new HashMap<>();

        // O(n)
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (numsMap.containsKey(complement)) {
                return new int[] {numsMap.get(complement), i};
            }
            numsMap.put(nums[i], i);
        }

        return null;
    }
}
