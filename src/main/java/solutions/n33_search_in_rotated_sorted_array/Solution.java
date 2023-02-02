package solutions.n33_search_in_rotated_sorted_array;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
public class Solution {
    public int searchRegular(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] < nums[hi]) hi = mid - 1;
            else lo = mid + 1;
        }

        int pivot = lo;
        lo = 0;
        hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int realMid = (mid + pivot) % nums.length;
            if (nums[realMid] == target) return realMid;
            if (nums[realMid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}
