package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Trial #2 better solution
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i); // value, index
        }

        for (int i = 0; i < nums.length; i++) {
            int leftover = target - nums[i];
            if (map.containsKey(leftover) && map.get(leftover) != i) {
                return new int[] {i, map.get(leftover)};
            }
        }

        // should never reach here.
        return new int[] {-1, -1};
    }
}


