class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;  // Adjusted initialization
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid is a peak
            if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == n - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (mid > 0 && nums[mid] < nums[mid - 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}