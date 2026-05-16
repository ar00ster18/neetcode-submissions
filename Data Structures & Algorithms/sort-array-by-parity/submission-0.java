class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++){
            if (nums[i] % 2 == 0) nums[i] *= -1;
        }

        Arrays.sort(nums);

        for (int i = 0; i < n; i++){
            nums[i] = Math.abs(nums[i]);
        }

        return nums;
    }
}