package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Trial #3
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int leftover = target - nums[i];
            if (map.containsKey(leftover)) {
                return new int[] {map.get(leftover), i};
            }
            map.put(nums[i], i);
        }
        // should never reach here.
        return new int[] { -1, -1 };
    }
}


