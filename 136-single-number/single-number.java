import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {


        Map<Integer, Integer> map = new HashMap<>();
        

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> mapE : map.entrySet()) {

            if (mapE.getValue() == 1) {
                return mapE.getKey();
            }
        }

        return 0;
    }
}