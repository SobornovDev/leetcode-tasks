package solutions.n33_search_in_rotated_sorted_array;

/**
 * @author : Sobornov Vladimir
 * @since : 21.11.2022
 **/
public class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            int mid = (hi + lo) / 2;
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        int root = lo;
        lo = 0;
        hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            int trueMid = (root + mid)%nums.length;
            if(nums[trueMid] == target) return trueMid;
            if(nums[trueMid] < target) {
                lo=mid+1;
            }
            else hi=mid-1;
        }
        return -1;
    }
}
