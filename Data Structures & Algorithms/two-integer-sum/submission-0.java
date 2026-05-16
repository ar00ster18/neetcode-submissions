class Solution {
    public int[] twoSum(int[] nums, int target) {
        int end = nums.length - 1;
        for (int i = 0; i <= end - 1; i++){
            for (int j = i + 1; j <= end; j++){
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }
}
