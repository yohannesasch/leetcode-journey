import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int runSum = 0;
        int totalSum = 0;

        for (int num : nums) {

            runSum += num;

            int target = runSum - k;
            
            if (map.containsKey(target)) {
                totalSum += map.get(target);
            }
            
            map.put(runSum, map.getOrDefault(runSum,0) + 1);
            
        }
        return totalSum;
    }
}
