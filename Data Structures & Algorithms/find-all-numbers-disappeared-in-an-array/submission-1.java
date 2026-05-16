class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // mark existing
        for (int n : nums){
            int i = Math.abs(n) - 1;
            nums[i] = -1 * Math.abs(nums[i]);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int val = nums[i];
            if (val > 0){
                res.add(i + 1);
            }
        }
        return res;
    }
}