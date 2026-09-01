
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> numbers = new HashMap<>();

        for (int num : nums) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a,b) -> numbers.get(a) - numbers.get(b)
        );

        for (int num : numbers.keySet()) {
            pq.add(num);

            if (pq.size() > k) {
                pq.remove();
            }
        }

        int[] result = new int[k];

        for(int i = 0; i < k; i++) {
            result[i] = pq.remove();
        }
        return result;
    }
}