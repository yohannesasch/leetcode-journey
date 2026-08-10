import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> number = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            if (number.containsKey(nums[i]) && (i - number.get(nums[i])) <= k){
                return true;
            }
            number.put(nums[i], i);
        }
        return false;
    }
}
