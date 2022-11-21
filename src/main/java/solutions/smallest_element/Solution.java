package solutions.smallest_element;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
public class Solution {
    public int contains(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (hi > lo) {
            int mid = (hi + lo) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return -1;
    }
}
