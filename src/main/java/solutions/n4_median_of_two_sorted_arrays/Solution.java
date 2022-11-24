package solutions.n4_median_of_two_sorted_arrays;

/**
 * @author : Sobornov Vladimir
 * @since : 24.11.2022
 **/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int len1 = nums1.length;
        int len2 = nums2.length;

        boolean isOdd = (len1 + len2) % 2 != 0;

        int low = 0;
        int high = len1;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (len1 + len2 + 1) / 2 - partitionX;

            double maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            double maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];

            double minRightX = (partitionX == len1) ? Integer.MAX_VALUE : nums1[partitionX];
            double minRightY = (partitionY == len2) ? Integer.MAX_VALUE : nums2[partitionY];

            if (minRightY >= maxLeftX && minRightX >= maxLeftY) {
                if (isOdd) {
                    return Math.max(maxLeftX, maxLeftY);
                } else {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                }
            } else if (maxLeftX > minRightX) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }

        }
        return -1;
    }
}

