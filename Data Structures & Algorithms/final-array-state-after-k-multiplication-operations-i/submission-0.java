class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        if (k == 0) return nums;
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        nums[minIndex] *= multiplier;
        return getFinalState(nums, k - 1, multiplier);
    }
}