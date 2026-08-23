class Solution {
    public void moveZeroes(int[] nums) {

        int track = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[track] = nums[i];
                track++;
            }
        }

        while (track < nums.length) {
            nums[track] = 0;
            track++;
        }
    }
}