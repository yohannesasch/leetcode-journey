class Solution {
    public int findNumbers(int[] nums) {

        int evenCounter = 0;

        for (int num : nums) {

            int digit = (num == 0) ? 1 : (int) Math.log10(Math.abs(num)) + 1;

            if (digit % 2 == 0) {
                evenCounter++;
            }
        }

        return evenCounter;
    }
}

