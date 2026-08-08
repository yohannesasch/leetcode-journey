import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {

        int state = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[state] = nums[i];
                state++;
            }
        }

        while (state < nums.length) {
            nums[state] = 0;
            state++;
        }
        System.out.println(Arrays.toString(nums));
    }
}