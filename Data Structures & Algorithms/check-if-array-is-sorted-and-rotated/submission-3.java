class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        // Just count the number of "drops"
        int drops = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] > nums[(i + 1) % len]) drops++;
        }
        return drops <= 1;
    }
}