import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        int mostRep = nums[0];
        int highestNumber = 0;

        for (int i=0; i<nums.length; i++){
            int count = numbers.getOrDefault(nums[i], 0) + 1;
            numbers.put(nums[i],count);

            if (count > highestNumber) {
                highestNumber =count;
                mostRep = nums[i];
            }
        }
        return mostRep;

    }
}