class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // avoids integer overflow
            
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;  // search left half
            } else {
                start = mid + 1; // search right half
            }
        }
        return -1;
    }
}
